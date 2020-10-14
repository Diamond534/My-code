/*
对于基本类型中的boolean值，Getter方法一定要写定is xxx的形式，而Set xxx规则不变
 */
public class Student {
    private String name;//姓名
    private int age;//年龄
    private boolean male;//是不是男的**基本类型；

    // 是不是男的；
    public  void  setMale(boolean b){
        male=b;
    }
    public  boolean isMale(){//基本类型是 **is……*
        return  male;
    }
    //姓名
    public void  setName(String str){
        name=str;
    }
    public  String getName(){
        return  name;
    }
    //年龄；
    public  void setAge(int num){
        age=num;
    }
    public  int getAge(){
        return  age;
    }
}
