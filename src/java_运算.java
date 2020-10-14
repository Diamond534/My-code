public class java_运算 {
    public static void main(String[] args) {
        int [] result=calc(10,20,30);
        System.out.println("sum:"+result[0]);
        System.out.println("avg:"+result[1]);

    }

    public static int[] calc(int a,int b,int c) {
        int sum=a+b+c;
        int avg=(sum/3);
        int [] array={
                sum,avg
        };

        /*int [] array1=new int[2];
        array1[0]=sum;
        array1[1]=avg;*/

        return array;

    }
}
