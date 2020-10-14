package Demo05;

import java.util.ArrayList;

/*
打印指定格式 ；

System.out.println(list);   [张三丰, 张无忌, 张飞, 张大仙, 张翠山]
System.out.println(list);   ｛张三丰@张无忌@张飞@张大仙@张翠山｝
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张飞");
        list.add("张大仙");
        list.add("张翠山");
        System.out.println(list);//[张三丰, 张无忌, 张飞, 张大仙, 张翠山]

        printArrayList(list);
    }

    public  static  void  printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if (i==list.size()-1){
                System.out.println(name+"}");
            }else {
                System.out.print(name+"@");
            }

        }
    }

}
