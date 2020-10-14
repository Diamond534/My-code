package java20200921;

import java.awt.Color;

import java2020092117.Dog;

public class Test {
	public static void main(String[] args) {
		Dog d1,d2,d3;//声明/定义 了三个对象 
		d1=new Dog(); //开辟空间---实例化
		d2=new Dog();
		d3=new Dog(); //构造方法 类名所组成的方法
		
		d1.dc=Color.red;
		d1.dName="小红狗";
		d1.dAge=1;
		d1.dSex="公狗";
		d1.dType="狼狗";
		d1.baozi();
		
		
		d2.dc=Color.pink;
		d2.dName="小粉狗";
		d2.dAge=3;
		d2.dSex="公狗";
		d2.dType="狼狗";
		d2.baozi();
		
		d3.dc=Color.blue;
		d3.dName="小蓝狗";
		d3.dAge=1;
		d3.dSex="公狗";
		d3.dType="狼狗";
		d3.baozi();
		
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		System.out.println(d3.getName());
	}

}
