package java20200923;
//父类***********
public class Animal {
	//Object -----------所有类的父类
	
	
	public String color;
	public String name;
	public String sex;
	public int age;
	public Animal() {
		
	}
//	public Animal() {
//		color="红色";
//		name="小狗";
//		sex="男的";
//		age=1;
//	}
	
	public Animal(String name) {
		color="红色";
		name="小狗";
		sex="男的";
		age=1;
	}
	public void run() {
		System.out.print("Animals can move");
	}

}
