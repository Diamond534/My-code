public class Set_Get_Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("小向");
        stu.setAge(19);
        stu.setMale(true);
        System.out.println("姓名："+stu.getName()+"\t年龄："+stu.getAge()+"\t是不是爷们儿："+stu.isMale());

        stu.setName("小南");
        stu.setAge(19);
        stu.setMale(false);
        System.out.println("姓名："+stu.getName()+"\t年龄："+stu.getAge()+"\t是不是爷们儿："+stu.isMale());
    }
}
