package java_practice;

import java.util.Arrays;

/*
 
 �������ͳ�Ա����û��static;
 publiv void eat() {}
 */

public class practice_17������� {
	public static void main(String[] args) {
		int [] array= {
			10,20,30,40,50	
		};
		//Ҫ�������ʽ ��[10,20,30,40,50]
		//������̣�
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if(i==array.length-1) {
				System.out.println(array[i]+"]");
			}else
			System.out.print(array[i]+"��");
		}
		
		System.out.println("==================");
		//�������
		System.out.println(Arrays.toString(array));
	}

}
