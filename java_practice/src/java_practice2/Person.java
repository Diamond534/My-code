package java_practice2;
/*
 һ��ʹ��private �������Σ���ô��������Ȼ���Է��ʣ�
 ������������Ͳ���Ҫֱ�ӷ��ʣ�
 
 ��ӷ���private��Ա���������Ƕ���һ��Getter/Setter����;
 * */
public class Person {
	
	String name;
	private int age;
	
	public void show() {
		System.out.println("�ҽУ�"+name+",���䣺"+age);
	}
	
	//�����Ա������ר��������age��������
	public void setAge(int num) {
		if(num<120&&num>=0) {
			age=num;
		}else {
			System.out.println("���ݲ�����");
		}
		
	}
	
	//�����Ա���������ڻ�ȡage������
	public int getAge() {
		return age;
	}

}
