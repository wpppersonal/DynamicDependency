# DynamicDependency
在android项目configure时将project依赖替换为远程依赖，提升构建速度。 

### 使用方法
### 1、在项目根目录下的build.gradle下添加maven仓库及classpath依赖
```
buildscript {
  repositories {
    maven {
      url 'https://www.jitpack.io'
    }
    
    mavenLocal()
  }
  
  dependencies {
        classpath 'com.github.wpppersonal.DynamicDependency:DynamicDependency:1.6'
  }
}
```

### 2、在moffice目录下的build.gradle添加插件
```
apply plugin: 'cn.wps.plugin.dynamicdependency' 
```

同步一下工程，即完成引用。 在android studio中gradle面板查看，每个模块的build任务组中增加了一个assembleAarAndUploadToMavenLocal的task。点击运行即可上传到本地mavenLocal地址中。 

### 3、申明替换信息 
在moffice对应的build.gradle文件夹中如下声明即可完成动态的依赖替换。 
```
dynamicDependency {
  ":xxx" {
    groupId = "xxx"
    artifactId = "xxx"
    version = "1.1-SNAPSHOT"
  }
}
```


