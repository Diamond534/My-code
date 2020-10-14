package Demo02;
/*
游戏存盘；；
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Save {
    public static void main(String[] args) throws IOException {
        Person person =new Person();
        person.name="小向";
        person.sex="男";
        person.age=19;
        person.hp=500;
        person.mp=500;
        person.action=100;
        person.defense=80;
        //存盘；
        FileOutputStream fo=new FileOutputStream("d:\\person");
        ObjectOutputStream oos=new ObjectOutputStream(fo);
        oos.writeObject(person);
        oos.close();
        fo.close();
    }

}
