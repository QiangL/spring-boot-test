# spring-boot-test
this is a project for precticing of spring boot

# 问题
1. tomcat 内嵌的ideabug 不能provided
2. 热部署 的配置  是idea 配置的问题
3. fastJson编码问题 可以从spring filter的编码解决
4. 多模块的application.properties 可以使用maven 合并文件,或者在依赖模块指定
5. 数据库时区设置 新的设置
6. driud配置 参考官网
7. web模块的Servlet，Filter，Listener使用 servlet3.0的注解形式
8. 多模块的maven分享资源文件和合并资源文件 maven shade plugin 和 remote resource plugin
9. mybatis 的注解使用 避免 alis和module在配置文件和代码都要定义的问题
10. 测试 powerMock能使用
11. logger 配置文件的properties格式 比xml更省力
12. 日志配置

# maven 插件
* shade 合并依赖文件成一个jar，包括合并资源文件
* dependency 将jar的依赖导入到当前工程
* 
