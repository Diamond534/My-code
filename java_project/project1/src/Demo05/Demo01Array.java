package Demo05;

import java.util.jar.JarOutputStream;

/*
对象数组；
**定义一个数组，用来存储3个Person对象；

 */
public class Demo01Array {
    public static void main(String[] args) {
        //创建长度为3的数组；里边存放Person类型的数组；
        //任何数据类型都可以做为数组元素的类型；
//        int[] array=new int[3];
        Person[] array=new Person[3];
        System.out.println(array); //地址值；[LDemo05.Person;@50cbc42f
        System.out.println(array[0]); //null

        //创建3个对象；
        Person one =new Person("小明",20);
        Person two =new Person("小向",19);
        Person three =new Person("小艾",18);

        //将one，two，three中的地址值赋值到 0，1，2，号元素；
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array); //地址值； [LDemo05.Person;@58ceff1
        System.out.println(array[0]);//地址值； Demo05.Person@282ba1e
        System.out.println(array[1]);//Demo05.Person@13b6d03
        System.out.println(array[2]);//Demo05.Person@f5f2bb7

        Person person=array[0];
        System.out.println("name;"+person.getName()+"age;"+person.getAge()); //name;小明age;20
        System.out.println("======================");
        System.out.println("name;"+array[1].getName()+"age;"+array[1].getAge());///name;小向age;19
    }
}
