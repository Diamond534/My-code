package java继承;

public class penguin {//企鹅类
	private String name;
	private int id;
	public penguin(String myName, int myid) {
		name=myName;
		id=myid;
	}
	public void eat() {
		System.out.print(name+"正在吃");
	}
	

}
