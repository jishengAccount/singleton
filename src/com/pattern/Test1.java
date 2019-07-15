package com.pattern;

import java.lang.reflect.Constructor;

/**
 * 
 * @author ASUS
 *
 */

public class Test1 {
	public static void main(String[] args) throws Exception {
		SingltonV1 t1=SingltonV1.instance;
		SingltonV1 t2=SingltonV1.instance;
		Class<SingltonV1> clzz1=SingltonV1.class;
		Constructor<SingltonV1> construt1 =  clzz1.getDeclaredConstructor();
		construt1.setAccessible(true);
		SingltonV1 t3 = construt1.newInstance();
		
		
		System.out.println("t1的hashcode"+t1.hashCode());
		System.out.println("t2的hashcode"+t2.hashCode());
		System.out.println("t3的hashcode"+t3.hashCode());
		
	}
	
	
}
