package java_practice;

public class practice_21�ֻ���ʹ��_20 {
	public static void main(String[] args) {
		//������
		//������ ������ =new �����ƣ�����
		practice_20�ֻ���_21 phone =new practice_20�ֻ���_21();
		System.out.println(phone.brand);//Ʒ�� null
		System.out.println(phone.color);//��ɫ null
		System.out.println(phone.price);//�۸� 0.0
		
		System.out.println("======");
		
		phone.brand="ƻ��";
		phone.color="��ɫ";
		phone.price=9999;
		System.out.println("Ʒ�ƣ�"+phone.brand);//Ʒ�� ƻ��
		System.out.println("��ɫ��"+phone.color);//��ɫ ��ɫ
		System.out.println("�۸�"+phone.price);//�۸� 9999.0
		
		System.out.println("======");
		
		phone.call("С��");//��С�Ǵ�绰
		phone.sendMessage(); //Ⱥ�����ţ�
		
	}

}
