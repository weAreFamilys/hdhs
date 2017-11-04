import axios from 'axios'
const SERVER_URL = 'http://47.52.168.54:8088'

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
  })
}
