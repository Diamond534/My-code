package xxx;

public class String_Class {
	
	public static void main(String[] args) {
		
		
		Object floatVar = 4.05;
		Object intVar = 99;
		Object stringVar = "78";
		System.out.format("�����ͱ�����ֵΪ"
				+"%f%n���ͱ�����ֵΪ"
				+"%d%n�ַ���������ֵΪ"
				+"is %s%n",floatVar,intVar,stringVar);
		/*
	       �����ͱ�����ֵΪ4.050000
		���ͱ�����ֵΪ99
		�ַ���������ֵΪis 78*/
		
		/*String fs;
		Object flaotVar = 78.0;
		Object intVar = 45;
		Object stringVar = "456";
		fs=String.format("�����ͱ�����ֵΪ"
				+"%f%n���ͱ�����ֵΪ"
				+"%d%n�ַ���������ֵΪ"
				+"is %s",flaotVar,intVar,stringVar);*/
		
		
		@SuppressWarnings("unused")
		char[] helloArray= {
			's','c','i','t','c'	
		};
		String helloString=new String(helloArray);
		System.out.println(helloString); //scitc
		
		String site="www.runoob.com";
		int len=site.length();
		System.out.println("���ȣ�"+len); //���ȣ�14
		
		String string1="����̳���ַ��";
		System.out.println(string1+"www.runoob.com"); //����̳���ַ��www.runoob.com
	}

}
