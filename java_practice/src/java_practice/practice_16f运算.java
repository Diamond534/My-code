package java_practice;

public class practice_16fÔËËã {
	public static void main(String[] args) {
		int [] result;
		result=calc(10, 20, 30);
		System.out.println("sum"+result[0]);
		System.out.println("avg"+result[1]);
	}
	public static int[] calc(int a,int b,int c) {
		int sum=a+b+c;
		int avg=sum/3;
		
		int [] array =new int[2];
		array[0]=sum;
		array[1]=avg;
		return array;
	}

}
