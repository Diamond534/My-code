package java20200923;
//子类************
public class Dog  extends Animal{//继承（Dog这个类继承Animal（动物 ）这个类）//***单继承***----每一个类只有一个父类  **私有的不能被继承**
	public Dog(String name) {
		super(name);//*************super调用 <父类对象> ********规定（**这行代码只能在第一行出现**）         this***********代表这个类本身的对象 ********
		// TODO Auto-generated constructor stub
//		sex="男";//-----调用子类
		super.sex="男";//-----调用父类
	}

	public int leg=4;
	public String sex;
	public void eat() {
		System.out.println("Dogs eat omnivorous food");
	}
	
//	public void run() {//覆盖（重写） override   //父类是公共的 子类也需要是公共的（子类修饰符>=父类修饰符的权限）
//		System.out.print("The dog walks on four legs");
//	}
	///<方法的重载 overload> 需要 满足 1.//参数（类型,(个数不一样)）一定不能相同2.//方法名一样
	
	public void run(String name ) {//覆盖 override
		System.out.print(name+"The dog walks on four legs");
	}
	

}
