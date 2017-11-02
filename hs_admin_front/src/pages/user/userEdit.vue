<template>
	<section>
		<!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px">
			<el-form :inline="true">
				<el-form-item>
					<el-button type="primary" @click="addFormVisible = true"><i class="fa fa-plus"></i> 新增</el-button>
				</el-form-item>
			</el-form>
		</el-col>

		<!--列表-->
		<el-table :data="users" border highlight-current-row v-loading="listLoading" @selection-change="selsChange" style="width: 100%">
			<el-table-column align="center" type="index" width="55" label=" ">
			</el-table-column>
			<el-table-column prop="account" label="登录账户" width="120" sortable>
			</el-table-column>
			<el-table-column prop="name" label="姓名" width="120" sortable>
			</el-table-column>
			<el-table-column prop="memo" label="地址" min-width="180" sortable>
			</el-table-column>
			<el-table-column label="操作">
				<template slot-scope="scope">
					<el-button
						size="mini"
						@click="handleEdit(scope.$index, scope.row)">编辑</el-button>
					<el-button
						size="mini"
						type="danger"
						@click="handleDelete(scope.$index, scope.row)">删除</el-button>
				</template>
    </el-table-column>
		</el-table>

		<!--工具条-->
		<el-col :span="24" class="toolbar">
			<el-pagination layout="prev, pager, next" :page-size="page" :total="total" style="text-align:center">
			</el-pagination>
		</el-col>
		
		<!--新增界面-->
		<el-dialog title="新增" :visible.sync="addFormVisible">
			<el-form :model="addForm" label-width="80px" :rules="addFormRules" ref="addForm" status-icon>
				<el-form-item label="登录账户" prop="account">
					<el-input v-model="addForm.account" auto-complete="off"></el-input>
				</el-form-item>
				<el-form-item label="姓名" prop="name">
					<el-input v-model="addForm.name" auto-complete="off"></el-input>
				</el-form-item>
				<el-form-item label="描述" prop="memo">
					<el-input v-model="addForm.memo" auto-complete="off"></el-input>
				</el-form-item>
			</el-form>
			<div slot="footer" class="dialog-footer">
				<el-button @click="addFormVisible = false">取消</el-button>
				<el-button type="primary" @click="addSubmit" :loading="addLoading">确 定</el-button>
			</div>
		</el-dialog>
	</section>
</template>

<script>
import send from '@/util/ajax'
  export default {
    data () {
      return {
        total: 0,
        page: 2,
        listLoading: false,
        sels: [],
        users: [],
				addFormVisible: false,// 新增界面是否显示
				addLoading: false,
				addForm: {
					account: '',
					name: ''
				},
				addFormRules: {
					account: [
						{ required: true, message: '请输入登录账户', trigger: 'blur' }
					],
					name: [
						{ required: true, message: '请输入姓名', trigger: 'blur' }
					]
				},
			}
    },
    mounted () {
			this.getUsers()
		},
    methods: {
      selsChange (sels) {
        this.sels = sels
      },
			//显示新增界面
			handleAdd () {
				this.addFormVisible = true
				this.addForm = {
					account: '',
					name: '',
					memo: ''
				}
			},
			//删除
			handleDelete (index, row) {
				this.$confirm('确认删除该记录吗?', '提示', {
					type: 'warning'
				}).then(() => {
					this.listLoading = true
					let para = { userId: row.userId }
						send({
								path: '/user/del',
								data: para
							}).then((res) => {
								console.log(res)
								this.listLoading = false
								if (res.success) {
									this.$message({
										message: '删除成功',
										type: 'success'
									})
									this.getUsers()
								} else {
									this.$message({
										message: '删除失败:' + res.msg,
										type: 'error'
									})
								}
							},
							// promise error
							(error) => {
								console.error(error)
								this.listLoading = false
								this.$message({
									message: '删除失败，请重试！',
									type: 'error'
								})
							})

				}).catch(() => {

				})
			},
			//新增
			addSubmit () {
				this.$refs.addForm.validate((valid) => {
					if (valid) {
						this.$confirm('确认提交吗？', '提示', {}).then(() => {
							this.addLoading = true
							let para = Object.assign({}, this.addForm)
							send({
								path: '/user/add',
								data: para
							}).then((res) => {
								console.log(res)
								this.addLoading = false
								if (res.success) {
									this.$message({
										message: '增加成功',
										type: 'success'
									})
									this.$refs['addForm'].resetFields()
									this.addFormVisible = false
									this.getUsers()
								} else {
									this.$message({
										message: '增加失败：' + res.msg,
										type: 'error'
									})
								}
							},
							// promise error
							(error) => {
								console.error(error)
								this.addLoading = false
								this.$message({
									message: '增加失败，请重试！',
									type: 'error'
								})
							})
					})
					}
				})
			},
			getUsers () {
				this.listLoading = true
				send({
              path: '/user/list',
              data: {}
            }).then((res) => {
              console.log(res)
              if (res.success) {
                console.log('获取成功')
									this.total = res.obj.total
									this.users = res.obj.users
									this.listLoading = false
              } else {
								this.listLoading = false
                this.$message({
                  showClose: true,
                  message: res.msg,
                  type: 'error'
                })
              }
            },
            // promise error
            (error) => {
              console.error(error)
							this.listLoading = false
              this.$message({
                showClose: true,
                message: '查询失败，请重试！',
                type: 'error'
              })
            })
			}
    }
  }
</script>

<style scoped>

</style>