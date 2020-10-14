package java20200929接口;

public class Banana implements IFrunit,Runnable {//香蕉
	
	//Runnable ---接口

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("Banana peel after eating");
		
	}

	@Override
	public void pick() {
		// TODO Auto-generated method stub
		System.out.print("Bananas are picked on the banana tree");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Banana thread running");
		
	}

}
