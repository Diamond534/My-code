package java20200929�ӿ�;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test_Set {
	@SuppressWarnings({"unchecked", "unlikely-arg-type" })
	public static void main(String[] args) {
		
//		Set<e>
		HashSet<String> set = new HashSet<String>();
		set.add("С��");
		set.add("С��");
		set.add("С��");
		set.add("С��");
		set.add("Сһ");
		set.add("С��");
		set.add("С��");
		set.add("С��");
		
		java.util.Iterator<String> it=set.iterator();//ѭ��������
	
		//ѭ��һ
		for(String s:set) {
			System.out.print(s+" "); //С�� С�� С�� С�� Сһ С�� 
		}
		/*ѭ����*/
//		for (int i = 0; i < set.size(); i++) {
//			System.out.print(set.);	
//		}
		
		//ѭ����
		while(it.hasNext()) {
			System.out.print(it.next()+" "); //С�� С�� С�� С�� Сһ С�� 
		}
		
		/*
		 * ���У�FIFO--�Ƚ��ȳ�
		 * ��ջ���Ƚ����*/
		
		/*
		//����
		Vector<String> names = new Vector<String>
		names.add("С��");
		names.add("С��");
		names.add("С��");
		names.add("С��");
		names.add("С��");
		for(String s:names) {
			System.out.print(s+ " ");
		}
		*/
		
		
		Myclass<Integer> m=new Myclass<Integer>(); //����***
		int a=m.add(12,13);
		
		/*
		//����
		@SuppressWarnings("deprecation")
		Date date=new Date(0, 0, 0);
		System.out.print(date);
		*/
		
		
		
	}

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private static void m(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private static Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private static java.util.Iterator<String> next() {
		// TODO Auto-generated method stub
		
		/*
		HashMap<String, String> Map = new HashMap<String,String>();////Map<String������, String��ֵ��>
		Map.put("001", "С��");////put����� ��
		Map.put("002", "С��");
		Map.put("003", "С��");
		Map.put("004", "С��");
		Map.put("005", "С��");
		Map.put("006", "С��");
		Map.put("007", "С��");
		Map.put("008", "С��");
		Map.keySet();
		@SuppressWarnings("unused")
		Object key = null;
		Iterator it1=iterator();
		while( ((java.util.Iterator<String>) it1).hasNext()) {
			Iterator k=it1=(Iterator) next();
			System.out.print(k+":"+Map.get(k)+"\n");
			
		}
		*/
		return null;
	}

}
