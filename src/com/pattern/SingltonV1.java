package com.pattern;
/**
 * 内部类的单例，具有懒加载，线程安全的特性
 * 
 * 缺点：利用反射可以破坏单例
 * @author ASUS
 *
 */

public class SingltonV1 {
	public static SingltonV1 instance=Demo.show();
	
	private SingltonV1() {}
	
	private static class Demo{
		static SingltonV1 show(){
			return new SingltonV1();
		}
	}
	
	public  SingltonV1 getInstance() {
		
		return instance;
	}

}
