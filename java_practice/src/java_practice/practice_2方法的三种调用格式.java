package java_practice;
/*
 * 定义方法完整格式 
 修饰符	返回值类型	方法名称（参数类型	参数名称，……）｛
  		方法体
  		reture 返回值；
   ｝
   
   修饰符：现阶段，public；static
   返回值类型：方法最终产生的数据结果的类型
   方法名称：方法名字
   参数类型：进入方法的数据类型
   参数名称：进入方法的数据对应的变量名称
   return：两个作用，第一停止当前方法，第二将后面的返回值还给调用处
   返回值：方法执行后最终产生的数据结果
   
   定义两个int数字相加的方法，三要素；
   返回值类型；泌
   方法名称；sum
   参数列表；int a，int b
 
 
 方法的三种调用格式；
 1，单独调用；方法名称（参数）；
 2，打印调用;System.out.println(方法名称（参数）)；
 3，赋值调用；数据类型 变量名称 =(方法名称（参数）)；
 
 注意：
 返回值固定写为void的，这种方法只能够单独调用；
 	不能够进行打印调用或者赋值调用；
 */
public class practice_2方法的三种调用格式 {
	public static void main(String[] args) {
		//单独调用
		sum(52, 20);
		System.out.println("=========");
		//打印调用
		System.out.println(sum(50, 63));//113
		//赋值调用 
		System.out.println("==========");
		int number=sum(4, 96);
		System.out.println("变量值"+number);//变量值100
		System.out.println("==========");
		 number += 20;
		 System.out.println("numbre的值为"+number);//numbre的值为120
	}
	
	public static int sum(int a,int b) {
		System.out.println("方法执行了；");
		int result = a+b;
		return result;
	}

}
