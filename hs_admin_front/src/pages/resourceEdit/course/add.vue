<template>
	<el-form ref="form" :model="form" :rules="myFormRules" label-width="100px" style="margin:50px 10px;width:95%;min-width:600px;">
		
		<el-form-item label="学科名称" prop="course_name">
			<el-input type="text" placeholder="请输入学科名称" v-model="form.course_name"></el-input>
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
				form: {
					course_name: ''
				},
				sumitBtnIsLoading: false,
				myFormRules: {
					course_name: [
						{ required: true, message: '请输入学科名称', trigger: 'blur' }
					]
				}
			}
		},
		methods: {
			// 提交表单
			submitForm () {
				this.$refs.form.validate((valid) => {
					if (valid) {
						this.$confirm('确认提交？', '提示').then(() => {
							this.sumitBtnIsLoading = true
							let para = Object.assign({}, this.form)
							console.log(this.form)
							send({
								path: '/course/add',
								data: para
							})
							.then((res) => {
								console.log(res)
								this.sumitBtnIsLoading = false
								if (res.success) {
									this.$message({
										message: '增加成功',
										type: 'success'
									})
									this.$router.push('/resource/course/list')
								} else {
									this.$message({
										message: '增加失败：' + res.msg,
										type: 'error'
									})
								}
							}) // end send
						}) //end confirm
					} // end if valid
				})
			}// end submitForm
		},
		destroyed () {
			
		},
		mounted () {

		}
	}

</script>