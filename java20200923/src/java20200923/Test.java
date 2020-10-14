package java20200923;

public class Test {
	
	
	public Object add(Object o1,Object o2) {
		if(o1 instanceof Double && o2 instanceof Double) {
			return(Double)o1+(Double)o2;
		}else if(o1 instanceof String && o2 instanceof String) {
			return (String)o1+(String)o2;
		}else {
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		Dog d1=new Dog(null);
		d1.age=1;
		d1.color="黄色";
		d1.sex="男";
		d1.leg=4;
		d1.name="小艾";
		d1.run();
//		String name = null;
		d1.run(d1.name);
		
		
		Dog d11=new Dog(null);
		Rice r1=new Rice();
		Object ob1=d11;
		Object ob2=r1;
		
		if(ob1 instanceof Dog) {
			System.out.println("ob1是一条狗");
		}else {
			System.out.println("ob1是一条狗");
		}
		
		
		
//		public static void main(String[] args) {
			Test t1=new Test();
			Object o1=t1.add(12.2,12.3);//24.5
//			Object o2=t1.add("12.2",12.3); //null
			Object o2=t1.add("12.2","12.3");//12.212.3
			System.out.println(o1);
			System.out.print(o2);
//		}
		
		
		
		
	}

}
