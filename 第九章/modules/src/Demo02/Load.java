package Demo02;
/*
读取；；
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("d:\\person");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Person person=(Person)ois.readObject();
        System.out.println(person.name+"\n");
        System.out.println(person.sex+"\n");
        System.out.println(person.action+"\n");
        System.out.println(person.age+"\n");
        System.out.println(person.defense+"\n");
        System.out.println(person.hp+"\n");
        System.out.println(person.mp+"\n");

        ois.close();
        fis.close();
    }
}
