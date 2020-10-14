public class person_hello {
    public static void main(String[] args) {
        Person person=new Person();
        //设置我自己的名字；
        person.name="小五";
        //设置别人的名字；
        person.sayHello("小艾");
        
        person.sayHello1("小艾");

        person.sayHello2("小艾");

        System.out.println(person);
        /*
        小艾,你好！	我是:小五
        小艾,你好！	我是:小艾
        小艾,你好！	我是:小五
         */
    }
}
