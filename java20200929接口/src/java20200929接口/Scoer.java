package java20200929接口;

public class Scoer {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int score=0;
		if(score<0 || score>100) {
			System.out.println("成绩不合法");
		}else if(score>=90&&score<=100) {
			System.out.println("成绩优秀");
		}else if(score>=80&&score<90) {
			System.out.println("成绩还行");
		}else if(score>=70&&score<80) {
			System.out.println("成绩良好");
		}else if(score>=60&&score<70) {
			System.out.println("成绩及格");
		}else {
			System.out.println("成绩不及格");
		}
		
		
	}

}
