package java_practice;

public class practice_22手机类使用_20 {
	public static void main(String[] args) {
		practice_20手机类_21 one=new practice_20手机类_21();
		
		one.brand="苹果";
		one.price=8388.0;
		one.color="黑色";
		
		method(one);//传递--地址值；
//		method(param);
		
				
	}
	public static void method(practice_20手机类_21 param) {
		System.out.println(param.brand);//苹果
		System.out.println(param.color);//黑色
		System.out.println(param.price);//8388.0
	}

}
