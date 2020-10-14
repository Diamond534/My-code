package java_practice;
/*
 面向对象的三大特征；封装，继承，多态；
 
 封装性在java中的体现；
 1，方法就是一种封装
 2，关键字private也是一种封装（私有化）
 */
public class practice_24封装 {
	public static void main(String[] args) {
		int [] array= {-4,10,20,20,30,5,0,50,70,100};
//		int max= array[0];
//		int min= array[0];
//		for (int i = 1; i < array.length; i++) {
//			if(array[i]<min) {
//				min=array[i];
//			}else {
//				max=array[i];
//			}
//		}
//		System.out.println("max:"+max);
//		System.out.println("min:"+min);
		
		
		int max=getMax(array);
		System.out.println("max"+max);
		
//		System.out.println("max"+Array[0]);
		
	}
	
	public static int getMax (int [] array) {
		int max= array[0];
		int min= array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min) {
				min=array[i];
			}else {
				max=array[i];
			}
		}
		
//		return min;
		return max;
		
//		int[] Array= {max,min};
//		return Array;
	}

}
