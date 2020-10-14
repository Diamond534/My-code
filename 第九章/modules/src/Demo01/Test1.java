package Demo01;
/*
字节流；
 */
import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

/*
输入/输出流；
 */

public class Test1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("d:\\Task.txt"); //输入
        FileOutputStream fos=new FileOutputStream("d:\\Task123.txt");//输出；
        BufferedInputStream bis =new BufferedInputStream(fis);//加上缓冲流
        BufferedOutputStream bos =new BufferedOutputStream(fos);//加上缓冲流；


        Date data1 =new Date() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
        };
        int n=0;
        int cnt=0;
        //定义一个数组；
        byte[] bs=new byte[100];
        while ((n=bis.read(bs,0,100))!=-1){ //读
//        while ((n=fis.read(bs,0,100))!=-1){ //读
//        while ((n=fis.read())!=-1){
//            System.out.println((char)n);
//            System.out.println(new String(bs,0,n));//输入方法；

//            fos.write(bs,0,n); //写
            fos.write(bs,0,n); //写
            cnt++;
            if (cnt>=1000){
                System.out.println(".");
                cnt=0;
            }
        }
        Date data2=new Date() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }
        };
        System.out.println((data1.getTime()-data2.getTime())/1000+"秒。\n");
        System.out.println("文件复制完毕；");
        fos.flush();//清空管道
        fos.close();//清空输出流，闭关；

        fis.close();//清空输入流

    }

}
