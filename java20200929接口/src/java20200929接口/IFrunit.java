package java20200929接口;

public interface IFrunit { 
	//水果//**在接口里边，所有的方法都是抽象方法*** 
	//***接口里边不能有构造方法 ***多继承
//	public static final String color = "";
	public String color="red"; //颜色
	public double weight=1; //重量
	public abstract void eat(); //吃 **写了抽象方法*
	public void pick(); //采摘 **没写抽象方法*
//	public void show(){
//		////**抽象方法不能有方法体
//	};
	
//	public IFruit() {
//		///***接口不能有构造方法
//	}
	
	/*
	 [可见度] interface 接口名称 [extends 其他的接口名] {
        // 声明变量
        // 抽象方法
	} 
	 * 
	 * import java.lang.*;
		//引入包
		 
		public interface NameOfInterface
		{
		   //任何类型 final, static 字段
		   //抽象方法
		}
		
		 Java语言的继承是单一继承，一个子类只能有一个父类（一个儿子只能有一个亲爹）
		 Java语言给我们提供了一种机制，用于处理继承单一的局限性的，接口
		 
		  接口：接口是一个比抽象类还抽象的类，接口里所有的方法全是抽象方法，接口和类的关系是实现，implements
		 interface
		 
		  格式：
		     interface 接口名 {
		  
		        }
		  
	 * 
	 */
	
	
}
