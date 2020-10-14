package java2020092117;

import java.awt.Color;  //引入/引用

public class Dog {
	
	static {
		int s=0;
		for(int i=1;i<=100;i++) {
			s+=i;
		}
		System.out.print(s);
	}
	
	//属性特征
	public static int count=0;//静态的(static)静态<可以用类名、对象名去引用 > ////不要定义太多的静态变量
	
			public Color dc;
			public String dName;
			public String dSex;
			private int dAge;
			protected String dType;
			
	//构造方法/*****通常是公共的，
	public Dog() {
		dc=Color.black;
		dName="小黑";
		dSex="男的";
		dAge=1;
		dType="中华田园犬";
		count++;
	}//自动生成（默认）//作用：通常是用来初始化数据
	
	
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {//回收方法 
		// TODO Auto-generated method stub
		super.finalize();//super(父对象 ) this（当前对象 ）
		count--;
	}
	
	public Dog(String dName){//<方法的重载 overload> 需要 满足 1.//参数（类型,(个数不一样)）一定不能相同2.//方法名一样
		this();//代表public Dog() 构造方法
		//Dog();
		dAge=1;
		
		//this;//**代表了我这个类有一个对象 /方法 
		this.dName=dName; //前一个dName代表public String dName;
		
		
	}
	
	public Dog(String dType,String dName) {//重载 overload
		
	}
	public Dog(int dAge) {//重载 overload
		
	}
			



	//行为特征
			public void baozi() { //行为
				System.out.println("The dog was happy and ate it");
			}
			public String getName() { //获取名字
				return dName;
			}
	
	//公共的	public
	//私有的	private
	//受保护的	protected
			//默认为	deffort
			
	//没有写包的类，默认为一个包
			

/*			
	public static void main(String[] args) {
		System.out.println("Kernighan 风格");
		
		System.out.println("Allmans 风格");
		
		
		
	}*/

}




















































