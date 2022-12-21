import java.io.FileWriter;
import java.util.List;
import java.io.*;
public class Savermanager {
    public void sever(List<Animal> animals){
        try (FileWriter writer = new FileWriter("zoolist.txt", false)) {
            for (Animal item:animals) {
            writer.write(item.toString()+"\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
