package java20200921;

import java.awt.Color;

import java2020092117.Dog;

public class Test {
	public static void main(String[] args) {
		Dog d1,d2,d3;//����/���� ���������� 
		d1=new Dog(); //���ٿռ�---ʵ����
		d2=new Dog();
		d3=new Dog(); //���췽�� ��������ɵķ���
		
		d1.dc=Color.red;
		d1.dName="С�칷";
		d1.dAge=1;
		d1.dSex="����";
		d1.dType="�ǹ�";
		d1.baozi();
		
		
		d2.dc=Color.pink;
		d2.dName="С�۹�";
		d2.dAge=3;
		d2.dSex="����";
		d2.dType="�ǹ�";
		d2.baozi();
		
		d3.dc=Color.blue;
		d3.dName="С����";
		d3.dAge=1;
		d3.dSex="����";
		d3.dType="�ǹ�";
		d3.baozi();
		
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		System.out.println(d3.getName());
	}

}
