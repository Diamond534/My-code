package java_practice;
/*
 数组的概念；
 1，数组是一种引用数据类型
 2，数组当中的多个数据，类型必须统一
 3，数组的长度在程序运行期间不可改变
 
 数组初始化；在内存当中创建一个数组，并向其中赋值；
 
 两种常见的初始化方式 ；
 1，动态初始化（指定长度）
 2，静态初始化（指定内容）
 
 动态初始化数组格式 ；
 数据类型 [] 数组名称 = new 数组类型 [数组长度]；
 
 静态初始化数组格式 ；
 数据类型 [] 数组名称 = new 数组类型 [] {元素1，元素2，……}；
  
 静态初始化数组格式 ；（省略格式）
 数据类型 [] 数组名称 =  {元素1，元素2，……}；
 
 访问数组元素格式；
 	数组名称[索引值]
 	(索引值从0开始；)
 */
public class practice_11数组的概念 {
	public static void main(String[] args) {
		int [] array= {
			1,2,3,4,5	
		};
		//直接打印数组名称；得到的是数组对应的：内存地址哈希值；
		System.out.println(array);//[I@1f28c152
		
		//直接打印数组中的元素
		System.out.println("=========");
		System.out.println(array[0]);//1
		System.out.println(array[2]);//3
		System.out.println(array[3]);//4
		System.out.println("=========");
		
		//将数组中的某一个元素，赋值交给变量；
		int num=array[4];
		System.out.println(num);//5
		
	}

}
