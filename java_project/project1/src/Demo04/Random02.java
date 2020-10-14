package Demo04;

import java.util.Random;

public class Random02 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);//范围0~9;
            System.out.println("随机数:\t"+num);
        }
    }
}
