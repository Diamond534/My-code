package java2020092117;

import java.awt.Color;  //����/����

public class Dog {
	
	static {
		int s=0;
		for(int i=1;i<=100;i++) {
			s+=i;
		}
		System.out.print(s);
	}
	
	//��������
	public static int count=0;//��̬��(static)��̬<������������������ȥ���� > ////��Ҫ����̫��ľ�̬����
	
			public Color dc;
			public String dName;
			public String dSex;
			private int dAge;
			protected String dType;
			
	//���췽��/*****ͨ���ǹ����ģ�
	public Dog() {
		dc=Color.black;
		dName="С��";
		dSex="�е�";
		dAge=1;
		dType="�л���԰Ȯ";
		count++;
	}//�Զ����ɣ�Ĭ�ϣ�//���ã�ͨ����������ʼ������
	
	
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {//���շ��� 
		// TODO Auto-generated method stub
		super.finalize();//super(������ ) this����ǰ���� ��
		count--;
	}
	
	public Dog(String dName){//<���������� overload> ��Ҫ ���� 1.//����������,(������һ��)��һ��������ͬ2.//������һ��
		this();//����public Dog() ���췽��
		//Dog();
		dAge=1;
		
		//this;//**���������������һ������ /���� 
		this.dName=dName; //ǰһ��dName����public String dName;
		
		
	}
	
	public Dog(String dType,String dName) {//���� overload
		
	}
	public Dog(int dAge) {//���� overload
		
	}
			



	//��Ϊ����
			public void baozi() { //��Ϊ
				System.out.println("The dog was happy and ate it");
			}
			public String getName() { //��ȡ����
				return dName;
			}
	
	//������	public
	//˽�е�	private
	//�ܱ�����	protected
			//Ĭ��Ϊ	deffort
			
	//û��д�����࣬Ĭ��Ϊһ����
			

/*			
	public static void main(String[] args) {
		System.out.println("Kernighan ���");
		
		System.out.println("Allmans ���");
		
		
		
	}*/

}




















































