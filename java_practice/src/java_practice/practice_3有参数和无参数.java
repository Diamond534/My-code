package java_practice;
/*
 �в�����
 �޲�����
 */
public class practice_3�в������޲��� {
	public static void main(String[] args) {
		method1(50, 10); //�����500
	}
	
	//��������ˣ���Ҫ֪�����������Ƕ��٣������޷����㣻
	//�в���
	public static void method1(int a,int b) {
		int result=a*b;
		System.out.println("�����"+result); //�����500
		System.out.println("==========");
		method2(); //�޲��� ������
	}
	//eg����ӡ����̶�10���ı��ַ���
	//�޲���
	public static void method2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello world!!! "+i);
		}
	}

}
