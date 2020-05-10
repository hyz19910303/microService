hystrix-dashboard 监控  
监控服务提供者 监控使用@hystrixCommand方法
对应本项目中的 microsoft-provider-user-hystrix-6001模块
中的getUserinfo方法
监控url为
localhost:6001/hystrix.stream
刷新localhost:6001/user/1
即可看到监控页面对应的变化
对fegin 全局目测不支持