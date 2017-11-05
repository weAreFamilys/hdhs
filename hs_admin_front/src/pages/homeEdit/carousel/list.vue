<template>
	<section>
		<!--工具条-->
		<el-col :span="24" class="toolbar" style="padding-bottom: 0px">
			<el-form :inline="true">
				<el-form-item>
					<el-button type="primary" @click="toAddPage"><i class="fa fa-plus"></i> 新增</el-button>
				</el-form-item>
			</el-form>
		</el-col>

		<!--列表-->
		<el-table :data="carousels" border highlight-current-row v-loading="listLoading" @selection-change="selsChange" style="width: 100%">
			<el-table-column prop="c_index" label="索引" width="80" sortable>
			</el-table-column>
			<el-table-column label="图片" min-width="300">
				<template slot-scope="scope">
					<img style="width:280px;height:150px;" :src="scope.row.c_img" />
				</template>
			</el-table-column>
			<el-table-column prop="c_is_publish" label="是否发布" sortable>
				<template slot-scope="scope">
					<span v-if="scope.row.c_is_publish === 1">已发布</span>
					<span v-else>未发布</span>
				</template>
			</el-table-column>
			<el-table-column prop="c_create_time" min-width="110" label="创建日期" sortable>
				<template slot-scope="scope">
					{{scope.row.c_create_time | formateDate}}
				</template>
			</el-table-column>
			<el-table-column label="操作" width="150">
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

		<!--工具条
		<el-col :span="24" class="toolbar">
			<el-pagination layout="prev, pager, next" :page-size="page" :total="total" style="text-align:center">
			</el-pagination>
		</el-col>
		-->
		<!--新增界面
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
		-->
	</section>
</template>

<script>
import send from '@/api'
  export default {
    data () {
      return {
        total: 0,
        page: 2,
        listLoading: false,
        sels: [],
        carousels: []
			}
    },
    mounted () {
			this.getCarousels()
		},
    methods: {
			toAddPage () {
				this.$router.push('/home/carousel/add');
			},
			// 获取轮播列表
			getCarousels () {
				this.listLoading = true
				send({
					path: '/carousel/list',
					data: {}
				})
				.then((res) => {
					console.log(res)
					if (res.success) {
						console.log('获取成功')
							this.total = res.obj.total
							this.carousels = res.obj.carousels
							this.listLoading = false
					} else {
						this.listLoading = false
						this.$message({
							showClose: true,
							message: res.msg,
							type: 'error'
						})
					}
				}) // end send
			},
      selsChange (sels) {
        this.sels = sels
      },
			// 修改
			handleEdit (index, row) {
				// 跳转到修改页
				// path 和 params不能一起使用
				this.$router.push({
					path: '/home/carousel/edit',
					query: {
						id: row.c_id
					}
				});
			},
			// 删除
			handleDelete (index, row) {
				this.$confirm('确认删除该记录吗?', '提示', {
					type: 'warning'
				}).then(() => {
					this.listLoading = true
					let para = { c_id: row.c_id }
					send({
							path: '/carousel/del',
							data: para
					})
					.then((res) => {
						console.log(res)
						this.listLoading = false
						if (res.success) {
							this.$message({
								message: '删除成功',
								type: 'success'
							})
							this.getCarousels()
						} else {
							this.$message({
								message: '删除失败:' + res.msg,
								type: 'error'
							})
						}
					}) // end send
				})
			}
    }
  }
</script>

<style scoped>

</style>