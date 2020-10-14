package java_practice;
/*
 通常情况下；一个类并不能直接使用，需要根据类创建一个对象，才能使用
 
 1，导包；指出需要使用的类，在什么位置
 	inport 包名称.类名称；
 	对于和当前属于同一个包的情况下，可以省略导包语句，
 2，创建；格式；
 	类名称 对象名 = new 类名称()
 	Student stu =new Student();
 3，使用；两种情况
 	使用成员变量；对象名.成员变量名称
 	使用成员方法；对象名.成员对象名（参数）
 	
 注意；
 	如果成员变量没有进行赋值，那将会有一个默认值，规则与数组一样；
 */
public class practice_19对象的创建及使用_18 {
	public static void main(String[] args) {
		//1,导包//省略
		
		//2，创建；
		//类名称 对象名=new 类名称（） ；
		practice_18类的定义_19_Student stu=new practice_18类的定义_19_Student();
		
		//3，使用
		System.out.println(stu.age);  //0
		System.out.println(stu.name); //null
		
		System.out.println("============");
		
		//改变对象中成员变量的内容 ；
		//将右侧的值，赋值交给stu对象中的name、age成员变量
		stu.age=20;
		stu.name="小艾";
		System.out.println(stu.age);
		System.out.println(stu.name);
		
		System.out.println("=============");
		
		//4,使用对象的成员方法；
		//对象名.成员方法名（）
		stu.eat();
		stu.sleep();
		stu.study();
		
		
		
	}
	
	

}
