package java_practice;
/*
 ʹ�ö�̬��ʼ������ʱ�����е�Ԫ�ؽ���ӵ��һ��Ĭ��ֵ������
 1���������ͣ�Ĭ��Ϊ0
 2���������ͣ�Ĭ��Ϊ0.0
 3���ַ����ͣ�Ĭ��Ϊ'\u0000'
 4���������ͣ�Ĭ��Ϊfalse
 5���������ͣ�Ĭ��Ϊnull
 
 */
public class practice_12��̬��ʼ������ {
	public static void main(String[] args) {
		//��̬��ʼ��һ�����飻
		int [] array=new int [2];
		
		System.out.println(array); //[I@1f28c152 **�ڴ��ֵַ**
		
		System.out.println(array[0]); //0
		System.out.println(array[1]); //0
		System.out.println("========");
		
		//������123��ֵ��������array�е�1��Ԫ�أ�
		array[1]=123;
		System.out.println(array[0]); //0
		System.out.println(array[1]); //123
		
	}

}
