/*
一个标准的类，有四个部分组成；
1，所有的成员变量都要使用private关键字修饰；
2，为每一个成员变量编写一对Getter/Setter方法；
3，编写一个无参构造方法；
4，编写一个全参构造方法；

这样的标准类也叫做 Java Bean
 */
public class student {
    private  String name;//姓名；
    private  int age;//年龄；

    //无参构造
    public student() {
    }
    //全参构造
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter/setter；
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
