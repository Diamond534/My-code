public class student_ {
    public static void main(String[] args) {
        student stu1=new student();
        System.out.println(stu1);//student@282ba1e
        stu1.setAge(20);
        stu1.setName("迪丽热巴");
        System.out.println("name:"+stu1.getName()+"\tage:"+stu1.getAge());
        System.out.println("=========================");

        student stu2=new student("小明",20);
        System.out.println("name:"+stu2.getName()+"\tage:"+stu2.getAge());

        stu2.setAge(25);
        System.out.println("name:"+stu2.getName()+"\tage:"+stu2.getAge());
    }
}
