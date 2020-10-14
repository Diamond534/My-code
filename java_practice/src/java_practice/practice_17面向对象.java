package java_practice;

import java.util.Arrays;

/*
 
 面向对象和成员方法没有static;
 publiv void eat() {}
 */

public class practice_17面向对象 {
	public static void main(String[] args) {
		int [] array= {
			10,20,30,40,50	
		};
		//要求：输出格式 ；[10,20,30,40,50]
		//面向过程；
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if(i==array.length-1) {
				System.out.println(array[i]+"]");
			}else
			System.out.print(array[i]+"，");
		}
		
		System.out.println("==================");
		//面向对象；
		System.out.println(Arrays.toString(array));
	}

}
