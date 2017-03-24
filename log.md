#工作日志

#1 做一个简易的导入教程
#2 配置gitgnore
#3 添加日志文件(本文件)
#4 配置成maven工程方便  jar包
#5  配置spring	
#6 配置mybatis
	spring配置文件目录及解读
	/resources
		├──	 application-context.xml spring配置	
		├──	 jdbc.properties			数据库配置	
		├──	 log4j.properties			log4j配置文件
		├── mybatis.xml					mybatis配置	
		└── config
				├──	 anonation.xml	   spring扫描器配置  		
				├──	 jdbc.xml				数据源dataSource配置
				├──	 mybatis.xml			mybatis工厂配置
				├──	 properties.xml	         加载properties文件
				└── transation.xml		事务管理
#7 实现bean dao service