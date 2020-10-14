package xxx;

public class java_if__else {
	public static void main(String[] args) {
		int x=10;
		if(x<20) {
			System.out.print("这是if语句");
		}
		
		System.out.print("\n");
		System.out.print("===============\n");
		
		int y=30;
		if(y<20) {
			System.out.print("这里是if语句");
		}else{
			System.out.print("这里是else语句");
		}
		
		System.out.print("\n");
		System.out.print("===============\n");
		
		int i=300;
		if(i>0&&i<=10) {
			System.out.print("1~10之间");
		}else if(i>10&&i<=20) {
			System.out.print("10~20之间");
		}else if(i>20&&i<=30) {
			System.out.print("20~30之间");
		}else {
			System.out.print("这是else语句");
		}
		System.out.print("\n");
		System.out.print("===============\n");
		
		int q=30;
		int w=20;
		for(int z = 1;z<=q;z++) {
			for(int c=1;c<=w;c++) {
//				System.out.print("c循环第"+c+"次");
				System.out.print("z循环第"+z+"次\n");
			}
//			System.out.print("c循环第"+c+"次");
//			System.out.print("z循环第"+z+"次\n");
			
		}
		System.out.print("\n");
		System.out.print("===============\n");
		
		char grade='C';
		switch(grade) {
		case'A':
			System.out.print("优秀");
			break;
		case'B':case'C':
			System.out.print("良好");
			break;
		case'D':
			System.out.print("及格");
			break;
		case'E':
			System.out.print("你还需要努力");
			break;
		default:
			System.out.print("未知等级");
			break;
		}
		System.out.print("\n你的等级是"+grade);
		
		System.out.print("\n");
		System.out.print("===============\n");
		
		int ii=5;
		switch(ii) {
		case 0:
			System.out.print("0");
		case 1:
			System.out.print("1");
		case 2:
			System.out.print("2");
		case 3:
			System.out.print("3");
		case 4:
			System.out.print("4");
		case 5:
			System.out.print("5");
		default :
			System.out.print("default");
		}
		System.out.print("\n");
		System.out.print("===============\n");
		
		float xx=5;
		xx+=10;
		System.out.print(xx);
		
		System.out.print("\n");
		System.out.print("===============\n");
		
		System.out.print("90度的正弦值"+Math.sin(Math.PI/2));
		System.out.print("\n");
		System.out.print("90度的余弦值"+Math.cos(90));
		System.out.print("\n");
		System.out.print("60度的正切 值"+Math.tan(Math.PI/3));
		System.out.print("\n");
		System.out.print("1度的正切值"+Math.atan(1));
		System.out.print("\n");
		System.out.print("3.14/2的角度值"+Math.toDegrees(Math.PI/2));
		System.out.print("\n");
		System.out.print("90度的正弦值"+Math.sin(Math.PI/2));
		System.out.print("\n");
		System.out.print("90度的正弦值"+Math.sin(Math.PI/2));
		System.out.print("\n");
		System.out.print("90度的正弦值"+Math.sin(Math.PI/2));
		System.out.print("\n");
		System.out.print(Math.PI);
		
		System.out.print("\n");
		System.out.print("===============\n");
		
		double[] nums= {
				1.4,1.5,1.6,1.7,1.8,1.9,2.0
		};
		for(double Num:nums) {
			test(Num);
		}
		
		
		Integer x2=Integer.valueOf(9);
		Double c2=Double.valueOf(5);
		Float a2=Float.valueOf("80");
		Integer b2=Integer.valueOf("444",16);//使用16进制
		
		System.out.print(x2);System.out.print("\t");
		System.out.print(c2);System.out.print("\t");
		System.out.print(a2);System.out.print("\t");
		System.out.print(b2);System.out.print("\t");
		
		System.out.print("\n");
		
		Integer x3=5;
		System.out.print(x3.toString());
		System.out.print("\t");
		System.out.print(Integer.toString(13));
		System.out.print("\t");
		System.out.print("\n======================\n");
		
		int x4=Integer.parseInt("9");
		System.out.print(x4+"\t");
		double c4=Double.parseDouble("5");
		System.out.print(c4+"\t");
		int b4=Integer.parseInt("123",16);
		System.out.print(b4);
		
		System.out.print("\n======================\n");
		Integer a5=-8;
		double d5=-100;
		float f5=-90;
		long l5=-99;
		short s5=-23;
		byte b5=-65;
		System.out.print(Math.abs(a5)+"\t");
		System.out.print(Math.abs(d5)+"\t");
		System.out.print(Math.abs(f5)+"\t");
		System.out.print(Math.abs(l5)+"\t");
		System.out.print(Math.abs(s5)+"\t");
		System.out.print(Math.abs(b5)+"\t");
		System.out.print("\n================\n");
		
		double dd1=100.675;
		float ff1=-90;
		System.out.print(Math.ceil(dd1)+"\t");
		System.out.print(Math.ceil(ff1)+"\t");
		System.out.print(Math.floor(dd1)+"\t");
		System.out.print(Math.floor(ff1)+"\t");
		System.out.print("\n=========================\n");
		
		double dddd1=100.657;
		double eeee1=100.500;
		double ffff1=100.200;
		System.out.print(Math.rint(dddd1)+"\t");
		System.out.print(Math.rint(eeee1)+"\t");
		System.out.print(Math.rint(ffff1)+"\t");
		System.out.print("\n===================\n");
		
		
	}

	@SuppressWarnings("unlikely-arg-type")
	private static void test(double num) {
		// TODO Auto-generated method stub
		System.out.print("Math.floor("+num+")="+Math.floor(num));
		System.out.print("\n");
		System.out.print("Math.round("+num+")="+Math.round(num));
		System.out.print("\n");
		System.out.print("Math.ceil("+num+")="+Math.ceil(num));
		System.out.print("\n");
		
		System.out.print("===============\n");
		Integer xxx=5;
		System.out.print(xxx+"==>byteValue():"+xxx.byteValue());
		System.out.print("\n");
		System.out.print(xxx+"==>doubleValue()"+xxx.doubleValue());
		System.out.print("\n");
		System.out.print(xxx+"==>floatVlaue()"+xxx.floatValue());
		System.out.print("\n");
		System.out.print(xxx+"==>shortValue()"+xxx.shortValue());
		System.out.print("\n");
		System.out.print(xxx+"==>longValue()"+xxx.longValue());
		System.out.print("\n");
		System.out.print(xxx+"==>intValue()"+xxx.intValue());
		System.out.print("\n");
		

		System.out.print("===============\n");
		Integer xx=5;
		System.out.print(xx.compareTo(3));
		System.out.print("\t");
		System.out.print(xx.compareTo(0));
		System.out.print("\t");
		System.out.print(xx.compareTo(5));
		System.out.print("\t");
		System.out.print(xx.compareTo(6));
		System.out.print("\t");
		System.out.print(xx.compareTo(-1));
		System.out.print("\t");
		
		
		System.out.print("\n");
		System.out.print("===============\n");
		
		Integer yy=5;
		Integer uu=10;
		Integer ii=5;
		Short oo=5;
		
//		System.out.print(yy.equals(yy));System.out.print("\t");
		System.out.print(yy.equals(uu));System.out.print("\t");
		System.out.print(yy.equals(ii));System.out.print("\t");
		System.out.print(yy.equals(oo));System.out.print("\t");
//		System.out.print(yy.equals(yy));System.out.print("\t");
		
		System.out.print("===============\n");
		System.out.print("\n");
	}
	
	

}
