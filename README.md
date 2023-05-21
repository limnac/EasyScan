# EasyScan
- 基于ZXing的Android扫描组件
- 一键集成使用

## 使用前须知

- 集成方式

- ```css
  allprojects {
  		repositories {
  			...
  			maven { url 'https://jitpack.io' }
  		}
  	}
  ```

- ```css
  dependencies {
  	        implementation 'com.github.limnac:EasyScan:Tag'
  	}
  ```

- 使用

- ```java
  EasyScanManager.getInstance().startEasyScan(this, new IEasyScan() {
      @Override
      public void getScanInfo(String msg) {
          Toast.makeText(getApplication(),msg,Toast.LENGTH_LONG).show();
      }
  });
  ```

- 权限需自行打开
