import axios from 'axios'
const SERVER_URL = 'http://127.0.0.1:8088'
export default function send (options = {}) {
  const {
    path = '',
    method = 'post',
    data
  } = options
  let url = SERVER_URL + path
  return new Promise((resolve, reject) => {
    axios({
      method,
      url,
      data,
      timeout: 60 * 1000,
      headers: {'Content-type': 'application/json;charset=UTF-8'}
    })
    .then((response) => {
      resolve(response.data)
    })
    .catch((error) => {
      if (error.message === 'Network Error') {
        reject(new Error('网络异常'))
      } else {
        reject(error.message)
      }
    })
  })
}
