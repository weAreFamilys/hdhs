<template>
	<el-form ref="form" :model="form" :rules="myFormRules" label-width="100px" style="margin:50px 10px;width:95%;min-width:600px;">
		<el-form-item label="轮播图片" prop="c_img">
			<el-button @click="uploadImg" type="success">上传图片<i class="el-icon-upload el-icon--right"></i></el-button>
			<div v-show="uploadImgIsShow" style="margin-top:20px;">
				<div>
					<img width="400" height="200" :src = "form.c_img" />
				</div>
				<el-button @click="delUploadImg" type="text" icon="el-icon-delete">删除</el-button>
				<el-input v-show="false" type="hidden" v-model="form.c_img"></el-input>
				<script v-show="false" id="uploadImgContainer" type="text/plain"></script>
			</div>
		</el-form-item>
		<el-form-item label="索引" prop="c_index">
			<el-input style="width:200px;" type="text" placeholder="请输入索引" v-model="form.c_index"></el-input>
		</el-form-item>

		<el-form-item label="标题" prop="c_title">
			<el-input type="text" placeholder="请输入标题" v-model="form.c_title"></el-input>
		</el-form-item>

		<el-form-item label="描述" prop="c_desc">
			<el-input :autosize="{ minRows: 4, maxRows: 6}" type="textarea" placeholder="请输入描述" v-model="form.c_desc"></el-input>
		</el-form-item>
		<!--
		<el-form-item label="是否有内容" prop="c_has_content">
			<el-radio-group v-model="form.c_has_content">
				<el-radio-button label="0">无内容</el-radio-button>
				<el-radio-button label="1">有内容</el-radio-button>
			</el-radio-group>
		</el-form-item>
		-->
		<el-form-item label="文章内容" prop="c_content">
				<script id="contentContainer" type="text/plain"></script>
		</el-form-item>

		<el-form-item label="是否发布" prop="c_is_publish">
				<el-radio border v-model="form.c_is_publish" label="0">不发布</el-radio>
				<el-radio border v-model="form.c_is_publish" label="1">发布</el-radio>
		</el-form-item>

		<el-form-item style="margin-top: 50px;">
			<el-button :loading="sumitBtnIsLoading" @click="submitForm" icon="el-icon-success" type="primary">已经填写完成，确定提交</el-button>
		</el-form-item>
		
	</el-form>
</template>

<script>
import send from '@/api'
	export default {
		data() {
			return {
        config: {
          initialFrameWidth: '100%',
          initialFrameHeight: '400'
        },
				form: {
					c_is_publish: '0',
					c_title: '',
					c_has_content: '0',
					c_desc: '',
					c_content: '',
					c_index: '0',
					c_img: ''
				},
				myFormRules: {
					c_img: [
						{ required: true, message: '请上传图片', trigger: 'blur' }
					],
					c_index: [
						{ required: true, message: '请输入索引', trigger: 'blur' }
					]
				},
				uploadImgIsShow: false,
				uploadImgUeditor: null,
				contentUeditor: null,
				sumitBtnIsLoading: false
			}
		},
		methods: {
			// 上传图片
			uploadImg () {
				// 显示上传图片对话框
				let dialog = this.uploadImgUeditor.getDialog('insertimage');
				dialog.open();
			},
			// 显示上传图片
			showUploadImg (args) {
				this.form.c_img = args[0].src;
				this.uploadImgIsShow = true;
			},
			// 删除上传照片
			delUploadImg () {
				this.$confirm('确认删除？', '提示').then(() => {
					this.uploadImgIsShow = false;
					this.form.c_img = '';
				});
			},
			initUE () {
				this.uploadImgUeditor = UE.getEditor('uploadImgContainer');
				this.uploadImgUeditor.addListener("ready", () => {
					this.uploadImgUeditor.setHide();
				})
				this.uploadImgUeditor.addListener('beforeInsertImage', (t, args) => {
					this.showUploadImg(args);
				});
				this.contentUeditor = UE.getEditor('contentContainer');
				this.contentUeditor.addListener("ready", () => {

				})
			},
			// 提交表单
			submitForm () {
				this.$refs.form.validate((valid) => {
					if (valid) {
						this.$confirm('确认提交？', '提示').then(() => {
							this.sumitBtnIsLoading = true
							let content = this.contentUeditor.getContent()
							if (content) {
								this.form.c_content = content
							}
							let para = Object.assign({}, this.form)
							console.log(this.form)
							send({
								path: '/carousel/edit',
								data: para
							})
							.then((res) => {
								console.log(res)
								this.sumitBtnIsLoading = false
								if (res.success) {
									this.$message({
										message: '修改成功',
										type: 'success'
									})
									this.$router.push('/home/carousel/list')
								} else {
									this.$message({
										message: '修改失败：' + res.msg,
										type: 'error'
									})
								}
							}) // end send
						}) //end confirm
					} // end if valid
				})
			},// end submitForm
			getCarousel(c_id){
				send({
					path: '/carousel/getById',
					data: {
						c_id
					}
				})
				.then((res) => {
					console.log(res)
					if (res.success) {
						// 显示图片
						this.form.c_img = res.obj.c_img
						this.uploadImgIsShow = true
						// 显示内容
						this.form.c_content = res.obj.c_content
						this.contentUeditor.addListener("ready", () => {
							this.contentUeditor.setContent(this.form.c_content)
						})
						this.form.c_index = res.obj.c_index + ''
						this.form.c_is_publish = res.obj.c_is_publish + ''
						this.form.c_title = res.obj.c_title
						this.form.c_id = res.obj.c_id
						this.form.c_desc = res.obj.c_desc

					} else {
						this.$message({
							message: '获取数据失败！',
							type: 'error'
						})
						this.$router.push('/home/carousel/list');
					}
				}) // end send
			}
		},
		destroyed () {
			this.uploadImgUeditor.destroy();
			this.contentUeditor.destroy();
		},
		mounted () {
			this.initUE();
			this.getCarousel(this.$route.query.id);
		}
	}

</script>