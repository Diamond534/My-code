package Demo01;

public class Test2 {

    public static void main(String[] args) throws Exception {//throws Exception:抛出这个类；（异常）
        int n=0,m=0;
        int i=0;
        if (i==0){
            throw new  Exception();//抛出异常；
        }

        n=10/0;
        m=Integer.valueOf("123");
        try {
            Class.forName("ABC");
        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
            System.out.println(e.toString());
//            e.printStackTrace();

//            throw;
//            throws;

        }


    }

}
