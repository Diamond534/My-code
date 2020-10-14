package xxx;

public class Math_class {
	public static void main(String[] args) {
		double x=11.635;
		double y=2.67;
		System.out.printf("e��ֵΪ%.4f%n",Math.E);
		System.out.printf("sqrt(%.3f)Ϊ%.3f%n",x,Math.sqrt(x));
		
		double degrees=45.00;
		double radians=Math.toRadians(degrees);
		System.out.printf("pi��ֵΪ%.4f%n",Math.PI);
		System.out.printf("%.2f�ȵ�����ֵΪ%.4f%n",degrees,Math.sin(radians));
		System.out.printf("%.2f�ȵ�����ֵΪ%.4f%n",degrees,Math.cos(radians));
		System.out.printf("%.2f�ȵ�����ֵΪ%.4f%n",degrees,Math.tan(radians));
		System.out.format("%.4f������ֵΪ%.4f��%n",Math.sin(radians),Math.toDegrees(Math.asin(Math.sin(radians))));
		System.out.format("%.4f������ֵΪ%.4f��%n",Math.cos(radians),Math.toDegrees(Math.acos(Math.sin(radians))));
		System.out.printf("%.4f������ֵΪ%.4f��%n",Math.tan(radians),Math.toDegrees(Math.atan(Math.sin(radians))));
		System.out.println(Math.atan2(x, y));
		System.out.println(Math.toDegrees(degrees));
		System.out.println(Math.toDegrees(degrees));
		System.out.println(Math.toDegrees(x));
		
		System.out.println(Math.toRadians(x));
		System.out.println(Math.toRadians(y));
		
		System.out.printf("%.4f\n",Math.random()*10);
		System.out.println(Math.random()*100000);
		
		//ѭ��
		int[] nums= {
			1,2,3,4,5,6,7,8,9,0	
		};
		for(int num:nums) {
			test(num);
		}
		
	}

	private static void test(int num) {
		// TODO Auto-generated method stub
		System.out.print(num+"\t");
		
	}

}
