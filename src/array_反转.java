public class array_反转 {
    public static void main(String[] args) {
        int[]array={
                1,2,3,5,8,9,6,4,0
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=========");

        /*
        初始化语句；int min = 0, max = array.length-1;
        条件判断；min<max;
        步进表达式；min++,max--
        循环体；反转/倒手；
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        * */
        for (int min = 0, max = array.length-1; min<max; min++,max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
