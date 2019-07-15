package com.pattern;


import java.io.Serializable;

/**
 * 解决序列化单例模式多个实例的问题
 * @author ASUS
 *
 */

public class SingltonV3 implements Serializable{
	
	private static boolean flag=false;
	
	private SingltonV3() {
		synchronized (SingltonV3.class) {
			if (flag == false) {
				flag=true;
			}else {
				throw new RuntimeException("单例已存在");
			}
		}
		
	}
	
	private static class Demo{
		
		private static SingltonV3 instance =new SingltonV3();
	}
	
	public static SingltonV3 getInstance() {
		
		return Demo.instance;
	}
	/**源码会调用反射**/
	private Object readResolve() {
		return getInstance();
	}

}
