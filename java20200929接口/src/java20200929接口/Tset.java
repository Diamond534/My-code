package java20200929接口;

import java.awt.List;

public class Tset {private static final String LinkedList = null;
private static Object list;

//测试
	
	public static void main(String[] args) {
		
		/*方法1---*/
//		Banana f1,f2;
//		///接口，抽象类 不能实例化 
//		f1=new Banana();
//		f2=new Banana();
//		new Thread(f1).start();
//		new Thread(f2).start();
		
		/*方法2---*/
		IFrunit f3 ,f4;
		///接口，抽象类 不能实例化 
		f3=new Banana();
		f4=new Banana();
		new Thread((Runnable) f3).start();
		new Thread((Runnable) f4).start();
		
		/*其他接口*/
//		list<E> ///泛型 ***广泛的类型***
		
		LinkedList list;
//		LinkedList<E>
		list =new LinkedList();
		list.add(null, 123);
		list.add("123");
		list.add(null, 123);
		list.add(null, 123);
		list.add("小艾");
		list.add("123");
		System.out.print(list.getFocusTraversalKeysEnabled());
		System.out.print(list.getHeight());
		
		
		
		
		
	}
	
	
	
}
