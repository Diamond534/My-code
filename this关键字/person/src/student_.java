import javax.xml.namespace.QName;
import java.awt.print.Pageable;

public class student_ {

    public static void main(String[] args) {
    //构造方法使用；
        student stu1=new student();//无参构造；
        student stu2=new student("小艾",20);//全参构造；
        student stu3=new student("小向",21);
        System.out.println("name:"+stu3.getName()+"age:"+stu3.getAge());
        //改变对象中的成员变量内容；使用set xxx方法；
        stu3.setAge(22);
        System.out.println("name:"+stu3.getName()+"age:"+stu3.getAge());
    }
}
