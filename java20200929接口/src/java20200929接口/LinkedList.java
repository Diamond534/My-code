package java20200929½Ó¿Ú;

import java.awt.List;

public class LinkedList extends List {
	
	private char[] get;

	public static void main(String[] args) {
		
		LinkedList list;
//		LinkedList<E>
		list =new LinkedList();
		list.add(null, 123);
		list.add("123");
		list.add(null, 123);
		list.add(null, 123);
		list.add("Ð¡°¬");
		list.add("123");
		System.out.println(list.getFocusTraversalKeysEnabled());
		System.out.println(list.getRows());
		
		
		
	}
	

}
