package java20200923;
//����************
public class Dog  extends Animal{//�̳У�Dog�����̳�Animal������ ������ࣩ//***���̳�***----ÿһ����ֻ��һ������  **˽�еĲ��ܱ��̳�**
	public Dog(String name) {
		super(name);//*************super���� <�������> ********�涨��**���д���ֻ���ڵ�һ�г���**��         this***********��������౾��Ķ��� ********
		// TODO Auto-generated constructor stub
//		sex="��";//-----��������
		super.sex="��";//-----���ø���
	}

	public int leg=4;
	public String sex;
	public void eat() {
		System.out.println("Dogs eat omnivorous food");
	}
	
//	public void run() {//���ǣ���д�� override   //�����ǹ����� ����Ҳ��Ҫ�ǹ����ģ��������η�>=�������η���Ȩ�ޣ�
//		System.out.print("The dog walks on four legs");
//	}
	///<���������� overload> ��Ҫ ���� 1.//����������,(������һ��)��һ��������ͬ2.//������һ��
	
	public void run(String name ) {//���� override
		System.out.print(name+"The dog walks on four legs");
	}
	

}
