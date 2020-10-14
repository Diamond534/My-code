package java20200929接口;

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
		set.add("小向");
		set.add("小艾");
		set.add("小飞");
		set.add("小刘");
		set.add("小一");
		set.add("小五");
		set.add("小向");
		set.add("小向");
		
		java.util.Iterator<String> it=set.iterator();//循环，遍历
	
		//循环一
		for(String s:set) {
			System.out.print(s+" "); //小刘 小艾 小飞 小向 小一 小五 
		}
		/*循环二*/
//		for (int i = 0; i < set.size(); i++) {
//			System.out.print(set.);	
//		}
		
		//循环三
		while(it.hasNext()) {
			System.out.print(it.next()+" "); //小刘 小艾 小飞 小向 小一 小五 
		}
		
		/*
		 * 队列：FIFO--先进先出
		 * 堆栈：先进后出*/
		
		/*
		//向量
		Vector<String> names = new Vector<String>
		names.add("小向");
		names.add("小向");
		names.add("小向");
		names.add("小向");
		names.add("小向");
		for(String s:names) {
			System.out.print(s+ " ");
		}
		*/
		
		
		Myclass<Integer> m=new Myclass<Integer>(); //泛型***
		int a=m.add(12,13);
		
		/*
		//日期
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
		HashMap<String, String> Map = new HashMap<String,String>();////Map<String（键）, String（值）>
		Map.put("001", "小向");////put（添加 ）
		Map.put("002", "小向");
		Map.put("003", "小向");
		Map.put("004", "小向");
		Map.put("005", "小向");
		Map.put("006", "小四");
		Map.put("007", "小二");
		Map.put("008", "小舞");
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
