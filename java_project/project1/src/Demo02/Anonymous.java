package Demo02;
/*
创建对象的标准格式；
类名称 对象名=new 类名称（）；

匿名对象就是只有右边的对象，没有左边的名字与赋值语句；
格式；
    new 类名称（）；

注意；匿名对象只能使用唯一的一次，下次在用不得不在创建一个新的对象；
 */
public class Anonymous {
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person one =new Person();
        one.name="小向";
        one.showName();//我叫小向

        System.out.println("=======================");
        //匿名对象；
        new Person().name="小艾";
        new Person().showName();//我叫null
    }
}
