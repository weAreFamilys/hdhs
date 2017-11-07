<template>
	<el-form ref="form" :model="form" :rules="myFormRules" label-width="100px" style="margin:50px 10px;width:95%;min-width:600px;">
		<el-form-item label="图片" prop="s_img">
			<el-button @click="uploadImg" type="success">上传图片<i class="el-icon-upload el-icon--right"></i></el-button>
			<div v-show="uploadImgIsShow" style="margin-top:20px;">
				<div>
					<img width="400" height="200" :src = "form.s_img" />
				</div>
				<el-button @click="delUploadImg" type="text" icon="el-icon-delete">删除</el-button>
				<el-input v-show="false" type="hidden" v-model="form.s_img"></el-input>
				<script v-show="false" id="uploadImgContainer" type="text/plain"></script>
			</div>
		</el-form-item>
		<el-form-item label="索引" prop="s_index">
			<el-input style="width:200px;" type="text" placeholder="请输入索引" v-model="form.s_index"></el-input>
		</el-form-item>

		<el-form-item label="标题" prop="s_title">
			<el-input type="text" placeholder="请输入标题" v-model="form.s_title"></el-input>
		</el-form-item>

		<el-form-item label="描述" prop="s_desc">
			<el-input :autosize="{ minRows: 4, maxRows: 6}" type="textarea" placeholder="请输入描述" v-model="form.s_desc"></el-input>
		</el-form-item>

		<el-form-item label="文章内容" prop="s_content">
				<script id="contentContainer" type="text/plain"></script>
		</el-form-item>

		<el-form-item label="是否发布" prop="s_is_publish">
				<el-radio border v-model="form.s_is_publish" label="0">不发布</el-radio>
				<el-radio border v-model="form.s_is_publish" label="1">发布</el-radio>
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
					s_is_publish: '0',
					s_title: '',
					s_has_content: '0',
					s_desc: '',
					s_content: '',
					s_index: '0',
					s_img: ''
				},
				myFormRules: {
					s_img: [
						{ required: true, message: '请上传图片', trigger: 'blur' }
					],
					s_index: [
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
				this.form.s_img = args[0].src;
				this.uploadImgIsShow = true;
			},
			// 删除上传照片
			delUploadImg () {
				this.$confirm('确认删除？', '提示').then(() => {
					this.uploadImgIsShow = false;
					this.form.s_img = '';
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
								this.form.s_content = content
							}
							let para = Object.assign({}, this.form)
							console.log(this.form)
							send({
								path: '/schoolLife/edit',
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
									this.$router.push('/home/schoolLife/list')
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
			getCarousel(s_id){
				send({
					path: '/schoolLife/getById',
					data: {
						s_id
					}
				})
				.then((res) => {
					console.log(res)
					if (res.success) {
						// 显示图片
						this.form.s_img = res.obj.s_img
						this.uploadImgIsShow = true
						// 显示内容
						this.form.s_content = res.obj.s_content
						this.contentUeditor.addListener("ready", () => {
							this.contentUeditor.setContent(this.form.s_content)
						})
						this.form.s_index = res.obj.s_index + ''
						this.form.s_is_publish = res.obj.s_is_publish + ''
						this.form.s_title = res.obj.s_title
						this.form.s_id = res.obj.s_id
						this.form.s_desc = res.obj.s_desc

					} else {
						this.$message({
							message: '获取数据失败！',
							type: 'error'
						})
						this.$router.push('/home/schoolLife/list');
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