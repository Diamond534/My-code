package java20200929�ӿ�;

public class Banana implements IFrunit,Runnable {//�㽶
	
	//Runnable ---�ӿ�

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
