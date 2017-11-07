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
		<el-table :data="lists" border highlight-current-row v-loading="listLoading" @selection-change="selsChange" style="width: 100%">
			<el-table-column align="center" type="index" width="55" label=" ">
			</el-table-column>
			<el-table-column prop="n_title" label="标题" min-width="300" style="over-flow:hidden">
			</el-table-column>
			<el-table-column prop="n_is_publish" label="是否发布" sortable>
				<template slot-scope="scope">
					<span v-if="scope.row.n_is_publish === 1">已发布</span>
					<span v-else>未发布</span>
				</template>
			</el-table-column>
			<el-table-column prop="n_type" label="类别" sortable>
				<template slot-scope="scope">
					<span v-if="scope.row.n_type === 0">新闻</span>
					<span v-else-if="scope.row.n_type === 1">公告</span>
					<span v-else>活动</span>
				</template>
			</el-table-column>
			<el-table-column prop="n_create_time" min-width="120" label="创建日期" sortable>
				<template slot-scope="scope">
					{{scope.row.n_create_time | formateDate}}
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
		
		<!--工具条-->
		<el-col :span="24" class="toolbar">
			<!-- 分页 -->
			<el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange" layout="total, sizes, prev, pager, next, jumper" :page-sizes="pageSizes" :page-size="pageSize" :total="total" style="text-align:center">
			</el-pagination>
		</el-col>
	</section>
</template>

<script>
import send from '@/api'
  export default {
    data () {
      return {
        total: 0,
        pageSize: 10,
				pageNum: 1,
				pageSizes: [10,20,30],
        listLoading: false,
        sels: [],
        lists: []
			}
    },
    mounted () {
			this.getLists()
		},
    methods: {
			toAddPage () {
				this.$router.push('/home/news/add');
			},
			handleCurrentChange (pageNum) {
				this.pageNum = pageNum
				this.getLists()
			},
			handleSizeChange (pageSize) {
				this.pageSize = pageSize
				this.getLists()
			},
			// 获取轮播列表
			getLists () {
				this.listLoading = true
				send({
					path: '/news/list',
					data: {
						pageSize: this.pageSize,
						pageNum: this.pageNum
					}
				})
				.then((res) => {
					console.log(res)
					if (res.success) {
						console.log('获取成功')
							const pageInfo = res.obj.page
							this.total = pageInfo.total
							this.pageNum = pageInfo.pageNum
							this.lists = pageInfo.list
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
					path: '/home/news/edit',
					query: {
						id: row.n_id
					}
				});
			},
			// 删除
			handleDelete (index, row) {
				this.$confirm('确认删除该记录吗?', '提示', {
					type: 'warning'
				}).then(() => {
					this.listLoading = true
					let para = { n_id: row.n_id }
					send({
							path: '/news/del',
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
							this.getLists()
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