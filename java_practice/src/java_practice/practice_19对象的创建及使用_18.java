package java_practice;
/*
 ͨ������£�һ���ಢ����ֱ��ʹ�ã���Ҫ�����ഴ��һ�����󣬲���ʹ��
 
 1��������ָ����Ҫʹ�õ��࣬��ʲôλ��
 	inport ������.�����ƣ�
 	���ں͵�ǰ����ͬһ����������£�����ʡ�Ե�����䣬
 2����������ʽ��
 	������ ������ = new ������()
 	Student stu =new Student();
 3��ʹ�ã��������
 	ʹ�ó�Ա������������.��Ա��������
 	ʹ�ó�Ա������������.��Ա��������������
 	
 ע�⣻
 	�����Ա����û�н��и�ֵ���ǽ�����һ��Ĭ��ֵ������������һ����
 */
public class practice_19����Ĵ�����ʹ��_18 {
	public static void main(String[] args) {
		//1,����//ʡ��
		
		//2��������
		//������ ������=new �����ƣ��� ��
		practice_18��Ķ���_19_Student stu=new practice_18��Ķ���_19_Student();
		
		//3��ʹ��
		System.out.println(stu.age);  //0
		System.out.println(stu.name); //null
		
		System.out.println("============");
		
		//�ı�����г�Ա���������� ��
		//���Ҳ��ֵ����ֵ����stu�����е�name��age��Ա����
		stu.age=20;
		stu.name="С��";
		System.out.println(stu.age);
		System.out.println(stu.name);
		
		System.out.println("=============");
		
		//4,ʹ�ö���ĳ�Ա������
		//������.��Ա����������
		stu.eat();
		stu.sleep();
		stu.study();
		
		
		
	}
	
	

}
