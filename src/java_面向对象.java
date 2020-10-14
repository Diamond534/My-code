import java.util.Arrays;

public class java_面向对象 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        //方法1
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.println(array[i]+"]");
            }else
                System.out.print(array[i]+"，");
        }
        System.out.println("=============");
        //方法2；
        System.out.println(Arrays.toString(array));
    }
}
