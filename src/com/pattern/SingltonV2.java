package com.pattern;
/**
 * 在v1的基础上解决了反射情况下会生成非单例的情况
 * @author ASUS
 *
 */

public class SingltonV2 {
	
	private static boolean flag=false;
	private SingltonV2(){
		
		synchronized (SingltonV2.class) {
			if (flag == false) {
				flag = true;
			}else {
				throw new RuntimeException("单例已存在");
			}
		}
		
	}
	
	//错误写法:静态成员变量会在类准备，解析阶段进行内存分配以及赋值，所以此时instance又会生成一个实例，造成不报错。
//	private static SingltonV2 instance=Demo.show();
//	private static class Demo {
//		static SingltonV2 show() {
//			return new SingltonV2();
//		}
//		
//	}
	
	/**正确写法**/
	private static class Demo{
		static SingltonV2 instance=new SingltonV2();
	}
	
	
	public static SingltonV2 getInstance() {
		
		return Demo.instance;
	}
	
}
