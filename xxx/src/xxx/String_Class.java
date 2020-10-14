package xxx;

public class String_Class {
	
	public static void main(String[] args) {
		
		
		Object floatVar = 4.05;
		Object intVar = 99;
		Object stringVar = "78";
		System.out.format("浮点型变量的值为"
				+"%f%n整型变量的值为"
				+"%d%n字符串变量的值为"
				+"is %s%n",floatVar,intVar,stringVar);
		/*
	       浮点型变量的值为4.050000
		整型变量的值为99
		字符串变量的值为is 78*/
		
		/*String fs;
		Object flaotVar = 78.0;
		Object intVar = 45;
		Object stringVar = "456";
		fs=String.format("浮点型变量的值为"
				+"%f%n整型变量的值为"
				+"%d%n字符串变量的值为"
				+"is %s",flaotVar,intVar,stringVar);*/
		
		
		@SuppressWarnings("unused")
		char[] helloArray= {
			's','c','i','t','c'	
		};
		String helloString=new String(helloArray);
		System.out.println(helloString); //scitc
		
		String site="www.runoob.com";
		int len=site.length();
		System.out.println("长度："+len); //长度：14
		
		String string1="菜鸟教程网址：";
		System.out.println(string1+"www.runoob.com"); //菜鸟教程网址：www.runoob.com
	}

}
