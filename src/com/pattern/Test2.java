package com.pattern;

import java.lang.reflect.Constructor;

/**
 * s
 * @author ASUS
 *
 */

public class Test2 {
	public static void main(String[] args) throws Exception {
		SingltonV2 t1=SingltonV2.getInstance();
		Class<SingltonV2> clzz1=SingltonV2.class;
		Constructor<SingltonV2> construt1 =  clzz1.getDeclaredConstructor();
		construt1.setAccessible(true);
		SingltonV2 t3 = construt1.newInstance();
		
		
		System.out.println("t1"+t1.hashCode());
		System.out.println("t3"+t3.hashCode());
		
	}
	
	
}
