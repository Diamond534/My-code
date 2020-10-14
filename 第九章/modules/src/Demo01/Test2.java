package Demo01;

import java.io.*;

/*
字符流；FileReader
 */
public class Test2 {
    public static void main(String[] args) throws IOException {  //throws FileNotFoundException 异常-->文件没有被发现；
        //读取文件 ；
        FileReader fr=new FileReader("d:\\Task.txt");
        BufferedReader br =new BufferedReader(fr);//加缓冲；

        //实现文件 复制；
        FileWriter fw = new FileWriter("d:\\Task1234.txt");//复制；
        BufferedWriter bw=new BufferedWriter(fw); //加缓冲；
        //

        int n=0;
        char[] cs=new char[1024]; //加数组；
        while ((n=br.read(cs,0,1024))!=-1){ //加了字符数组格式 ；加了缓冲；
//        while ((n=fr.read(cs,0,1024))!=-1){ //加了字符数组格式 ；
//        while ((n=fr.read())!=-1){
            System.out.println(new String(cs,0,n));////加了字符数组格式 ；
//            System.out.print((char)n);
            fw.write(cs,0,n);//复制；；

        }
        fr.close();
        fr.close();

        fw.close();//关闭；
        bw.close();
    }

}
