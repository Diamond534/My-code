package java_practice;
/*
 * ���巽��������ʽ 
 ���η�	����ֵ����	�������ƣ���������	�������ƣ���������
  		������
  		reture ����ֵ��
   ��
   
   ���η����ֽ׶Σ�public��static
   ����ֵ���ͣ��������ղ��������ݽ��������
   �������ƣ���������
   �������ͣ����뷽������������
   �������ƣ����뷽�������ݶ�Ӧ�ı�������
   return���������ã���һֹͣ��ǰ�������ڶ�������ķ���ֵ�������ô�
   ����ֵ������ִ�к����ղ��������ݽ��
   
   ��������int������ӵķ�������Ҫ�أ�
   ����ֵ���ͣ���
   �������ƣ�sum
   �����б�int a��int b
 
 
 ���������ֵ��ø�ʽ��
 1���������ã��������ƣ���������
 2����ӡ����;System.out.println(�������ƣ�������)��
 3����ֵ���ã��������� �������� =(�������ƣ�������)��
 
 ע�⣺
 ����ֵ�̶�дΪvoid�ģ����ַ���ֻ�ܹ��������ã�
 	���ܹ����д�ӡ���û��߸�ֵ���ã�
 */
public class practice_2���������ֵ��ø�ʽ {
	public static void main(String[] args) {
		//��������
		sum(52, 20);
		System.out.println("=========");
		//��ӡ����
		System.out.println(sum(50, 63));//113
		//��ֵ���� 
		System.out.println("==========");
		int number=sum(4, 96);
		System.out.println("����ֵ"+number);//����ֵ100
		System.out.println("==========");
		 number += 20;
		 System.out.println("numbre��ֵΪ"+number);//numbre��ֵΪ120
	}
	
	public static int sum(int a,int b) {
		System.out.println("����ִ���ˣ�");
		int result = a+b;
		return result;
	}

}
