<template>
  <el-row style="height:100%;margin-top:100px;">
    <el-col :span="8" :offset="8">
      <h2 class="title">桦树林子学校网站后台管理系统</h2>
      <el-form :model="myform" ref="myform" :rules="myrules" status-icon>
        <el-form-item label="用户名" prop="account">
          <el-input placeholder="请输入用户名" type="text" v-model="myform.account" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="pass">
          <el-input placeholder="请输入密码" type="password" v-model="myform.pass" auto-complete="off"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="width:100%" type="primary" @click="submitForm('myform')">登 录</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
</template>

<script>
  export default {
    data () {
      var validateAccount = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入用户名'))
        } else {
          callback()
        }
      }
      var validatePass = (rule, value, callback) => {
        if (value === '') {
          callback(new Error('请输入密码'))
        } else {
          callback()
        }
      }
      return {
        myform: {
          account: '',
          pass: ''
        },
        myrules: {
          account: [
            { validator: validateAccount, trigger: 'blur' }
          ],
          pass: [
            { validator: validatePass, trigger: 'blur' }
          ]
        }
      }
    },
    mounted () {},
    methods: {
      submitForm () {
        this.$notify({
          title: '错误',
          message: '用户名密码错误!',
          type: 'error',
          duration: 3000
        })
      }
    }
  }
</script>
<style>
  body {
    background-color: #f0f0f0
  }
  .title {
    width:100%; 
    text-align:center;
    color: #2D2F33
  }
</style>
