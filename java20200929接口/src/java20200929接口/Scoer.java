package java20200929�ӿ�;

public class Scoer {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int score=0;
		if(score<0 || score>100) {
			System.out.println("�ɼ����Ϸ�");
		}else if(score>=90&&score<=100) {
			System.out.println("�ɼ�����");
		}else if(score>=80&&score<90) {
			System.out.println("�ɼ�����");
		}else if(score>=70&&score<80) {
			System.out.println("�ɼ�����");
		}else if(score>=60&&score<70) {
			System.out.println("�ɼ�����");
		}else {
			System.out.println("�ɼ�������");
		}
		
		
	}

}
