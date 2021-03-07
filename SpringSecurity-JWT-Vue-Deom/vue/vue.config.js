module.exports = {
    // options...
    devServer: {
        port: 8080,
        // Vue 跨域设置
        proxy: {
            '/api': {
                target: 'http://127.0.0.1:8088',
                changeOrigin: true,
                ws: true,
                pathRewrite: {
                    '^/api': ''
                }
            }
        }
    }
}