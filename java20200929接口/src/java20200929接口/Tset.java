package java20200929�ӿ�;

import java.awt.List;

public class Tset {private static final String LinkedList = null;
private static Object list;

//����
	
	public static void main(String[] args) {
		
		/*����1---*/
//		Banana f1,f2;
//		///�ӿڣ������� ����ʵ���� 
//		f1=new Banana();
//		f2=new Banana();
//		new Thread(f1).start();
//		new Thread(f2).start();
		
		/*����2---*/
		IFrunit f3 ,f4;
		///�ӿڣ������� ����ʵ���� 
		f3=new Banana();
		f4=new Banana();
		new Thread((Runnable) f3).start();
		new Thread((Runnable) f4).start();
		
		/*�����ӿ�*/
//		list<E> ///���� ***�㷺������***
		
		LinkedList list;
//		LinkedList<E>
		list =new LinkedList();
		list.add(null, 123);
		list.add("123");
		list.add(null, 123);
		list.add(null, 123);
		list.add("С��");
		list.add("123");
		System.out.print(list.getFocusTraversalKeysEnabled());
		System.out.print(list.getHeight());
		
		
		
		
		
	}
	
	
	
}
