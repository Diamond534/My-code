package java_practice2;

public class DomePerson {
	public static void main(String[] args) {
		Person person=new Person();
		person.show();
		
		System.out.println("================");
		
//		person.age=-18;
		person.setAge(20);
		person.name="Ð¡°®";
		person.show();
	}

}
