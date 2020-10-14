package java_practice;

public class practice_23手机类使用_20 {
	public static void main(String[] args) {
		practice_20手机类_21 two =getPhone();
		System.out.println(two.brand);
		System.out.println(two.color);
		System.out.println(two.price);
	}
	public static practice_20手机类_21 getPhone() {
		practice_20手机类_21 one =new practice_20手机类_21();
		one.brand="苹果";
		one.color="金色";
		one.price=8488;
		return one;
		
	}

}
