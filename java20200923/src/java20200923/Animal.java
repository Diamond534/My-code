package java20200923;
//����***********
public class Animal {
	//Object -----------������ĸ���
	
	
	public String color;
	public String name;
	public String sex;
	public int age;
	public Animal() {
		
	}
//	public Animal() {
//		color="��ɫ";
//		name="С��";
//		sex="�е�";
//		age=1;
//	}
	
	public Animal(String name) {
		color="��ɫ";
		name="С��";
		sex="�е�";
		age=1;
	}
	public void run() {
		System.out.print("Animals can move");
	}

}
