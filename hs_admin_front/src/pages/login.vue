<template>
  <el-form :model="myform" ref="myform" :rules="myrules" status-icon class="login-container">
    <h2 class="title">桦树林子学校网站后台管理系统</h2>
    <el-form-item prop="account">
      <el-input placeholder="请输入用户名" type="text" v-model="myform.account" auto-complete="off"></el-input>
    </el-form-item>
    <el-form-item prop="pass">
      <el-input placeholder="请输入密码" type="password" v-model="myform.pass" auto-complete="off"></el-input>
    </el-form-item>
    <el-checkbox v-model="checked" checked class="remember">记住密码</el-checkbox>
    <el-form-item style="width:100%">
      <el-button :loading="isLoading" style="width:100%" type="primary" @click="submitForm('myform')">登 录</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
  import send from '@/api'
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
        isLoading: false,
        checked: true,
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
      submitForm (formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            // 显示按钮loading 禁止连续点击
            this.isLoading = true
            // 调用 ajax 请求，验证登录是否成功
            send({
              path: '/login/checkUser',
              data: {
                account: this.myform.account,
                password: this.myform.pass
              }
            })
            .then((res) => {
              console.log(res)
              if (res.success) {
                console.log('登录成功')
                this.$router.push({ path: '/' })
              } else {
                this.isLoading = false
                this.$message({
                  showClose: true,
                  message: res.msg,
                  type: 'error'
                })
              }
            })
          } else {
            // validate error
            return false
          }
        })
      }
    }
  }
</script>
<style scoped>
  .login-container {
    -webkit-border-radius: 5px;
    border-radius: 5px;
    -moz-border-radius: 5px;
    background-clip: padding-box;
    margin: 150px auto;
    width: 350px;
    padding: 35px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eaeaea;
    box-shadow: 0 0 25px #cac6c6;
  }
  .remember {
    margin: 0px 0px 35px 0px;
  }
  .title {
    margin: 0px auto 40px auto;
    text-align: center;
    color: #505458;
  }
</style>
