import org.w3c.dom.ls.LSOutput;

/*
当方法中的局部变量与成员变量重名时，根据’就近原则‘优先使用局部变量；
如需要访问本类中的成员变量，则需使用this关键字，格式；
this.成员变量名

*通过谁调用的方法，谁就是this；**
 */
public class Person {
    String name;//我自己的名字；

    public  void  sayHello(String who){//who;对方的名字
        System.out.println(who+",你好！\t我是:"+name);
    }

    //只能访问对方的名字，自己的名字不能访问；
    public  void  sayHello1(String name){//name;对方的名字
        System.out.println(name+",你好！\t我是:"+name);
    }

    public  void  sayHello2(String name){//name;对方的名字
        System.out.println(name+",你好！\t我是:"+this.name);

        System.out.println(this);
    }



}
