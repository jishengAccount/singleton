package com.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test3 {
	public static void main(String[] args) throws Exception {
		SingltonV3 t1=SingltonV3.getInstance();
		SingltonV3 t2=SingltonV3.getInstance();
		ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream
				("D:\\workbench\\eclipse-workspace-oxen\\Singleton\\src\\com\\pattern\\test3.ser"));
		
		objOut.writeObject(t1);
		
		//反序列化
		ObjectInputStream objIn=new ObjectInputStream(new FileInputStream
				("D:\\workbench\\eclipse-workspace-oxen\\Singleton\\src\\com\\pattern\\test3.ser"));
		SingltonV3 t3 = (SingltonV3) objIn.readObject();
		

		System.out.println("t1的hashcode"+t1.hashCode());
		System.out.println("t2的hashcode"+t2.hashCode());
		System.out.println("t3的hashcode"+t3.hashCode());
		
		
		
		
		
	}

}
