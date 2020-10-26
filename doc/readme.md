###### standard模式

1.当从非Activity的context启动activity时，需要携带FLAG_ACTIVITY_NEW_TASK标志位

2.当启动一个带有affinity的activity时，如果这个activity已经在该task有实例了，则直接走恢复流程

3.如果从应用内启动standard activity的affinity就是默认的affinity，则会每次都新建一个实例



###### singletop模式

![singleTop](H:\AndroidPromote\Android升华\1.提升班课程\第二期\12.framework\5.AMS\4\singleTop.png)



![7d892c0c79f46db2591c915b7a4c8cc](C:\Users\gz04766\AppData\Local\Temp\WeChat Files\7d892c0c79f46db2591c915b7a4c8cc.jpg)

针对启动者：





##### 启动模式的应用场景

singletop：适合启动同类型的activity：

​					接收通知启动的内容显示页面

 					耗时操作返回界面

​					 登录界面



singleTask：适合作为程序入口：Webview页面，扫一扫页面，确认订单界面，付款界面



singleInstance：适合需要与程序分离开的页面：闹铃的响铃界面，来电页面，锁屏页