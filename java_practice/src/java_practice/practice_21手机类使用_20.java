package java_practice;

public class practice_21手机类使用_20 {
	public static void main(String[] args) {
		//创建类
		//类名称 对象名 =new 类名称（）；
		practice_20手机类_21 phone =new practice_20手机类_21();
		System.out.println(phone.brand);//品牌 null
		System.out.println(phone.color);//颜色 null
		System.out.println(phone.price);//价格 0.0
		
		System.out.println("======");
		
		phone.brand="苹果";
		phone.color="红色";
		phone.price=9999;
		System.out.println("品牌："+phone.brand);//品牌 苹果
		System.out.println("颜色："+phone.color);//颜色 红色
		System.out.println("价格："+phone.price);//价格 9999.0
		
		System.out.println("======");
		
		phone.call("小乔");//给小乔打电话
		phone.sendMessage(); //群发短信；
		
	}

}
