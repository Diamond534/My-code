package Demo05;

import java.util.ArrayList;
/*
如果要向ArrayList中存储基本类型，需使用基本类型对应的‘包装类‘；

基本类型        包装类（引用类型，包装类位于java.lang包下）
byte            Byte
short           Short
int             Integer     [特殊]
long            Long
float           Float
double          Double
char            Character   [特殊]
boolean         Boolean

从jdk1.5+开始，支持自动装箱，自动拆箱；
自动装箱；基本类型--》包装类型
自动拆箱；包装类型--》基本类型

 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA =new ArrayList<>();
        //错误写法，泛型只能是引用类型，不能是基本类型；
//        ArrayList<int> listB=new ArrayList<>();

        ArrayList<Integer> listC=new ArrayList<>();
        listC.add(100);
        listC.add(110);
        listC.add(120);
        System.out.println(listC);//[100, 110, 120]

        System.out.println(listC.get(1));//110

        Integer num = listC.get(2);
        System.out.println(num);//120
        int num1 = listC.get(2);
        System.out.println(num1);//120
    }

}
