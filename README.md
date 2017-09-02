项目目标： 学习并练习Retrofit和RxJava

当前进度：
1. 不对Retrofit进行封装，尽调用相关API实现联网请求功能

所遇问题：
1. ButterKnife注解OnClick方法不执行(已解决, 感谢好友Knight的帮助)

解决思路：
1. ButterKnife使用不仅仅需要dependence相关`compile 'com.jakewharton:butterknife:8.8.1'`,还需要配置`classpath 'com.jakewharton:butterknife-gradle-plugin:8.8.1'`插件,详情配置方法参考ButterKnife官方GitHub
https://github.com/JakeWharton/butterknife
