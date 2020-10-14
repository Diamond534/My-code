package java_practice2;
/*
 一旦使用private 进行修饰，那么本类中仍然可以访问；
 但，超出本类就不能要直接访问；
 
 间接访问private成员变量，就是定义一对Getter/Setter方法;
 * */
public class Person {
	
	String name;
	private int age;
	
	public void show() {
		System.out.println("我叫："+name+",年龄："+age);
	}
	
	//这个成员方法，专门用于向age设置数据
	public void setAge(int num) {
		if(num<120&&num>=0) {
			age=num;
		}else {
			System.out.println("数据不合理！");
		}
		
	}
	
	//这个成员方法，用于获取age的数据
	public int getAge() {
		return age;
	}

}
