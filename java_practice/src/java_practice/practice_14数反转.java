package java_practice;

public class practice_14Êý·´×ª {
	public static void main(String[] args) {
		int [] array= {
			1,2,3,4,5,6,7,8,9,0
		};
		int len=array.length;
		System.out.println("length:"+len);
		System.out.println("=============");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("=============");
		for(int min = 0,max=array.length-1;min<max;min++,max--) {
			int temp=array[min];
			array[min]=array[max];
			array[max]=temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
