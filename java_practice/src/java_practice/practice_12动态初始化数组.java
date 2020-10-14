package java_practice;
/*
 使用动态初始化数组时，其中的元素将会拥有一个默认值。规则；
 1，整型类型；默认为0
 2，浮点类型；默认为0.0
 3，字符类型；默认为'\u0000'
 4，布尔类型；默认为false
 5，引用类型；默认为null
 
 */
public class practice_12动态初始化数组 {
	public static void main(String[] args) {
		//动态初始化一个数组；
		int [] array=new int [2];
		
		System.out.println(array); //[I@1f28c152 **内存地址值**
		
		System.out.println(array[0]); //0
		System.out.println(array[1]); //0
		System.out.println("========");
		
		//将数据123赋值交给数组array中的1号元素；
		array[1]=123;
		System.out.println(array[0]); //0
		System.out.println(array[1]); //123
		
	}

}
