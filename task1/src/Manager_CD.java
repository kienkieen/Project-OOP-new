import java.util.ArrayList;
import java.util.List;

public class Manager_CD {
 List<Dia_CD> diaCds;
    public void managerDiaCD(){
        this.diaCds = new ArrayList<>(diaCds);
    }
    public void addCD(Dia_CD x){
        this.diaCds.add(x);
    }
    public void show(){
        this.diaCds.forEach(it -> System.out.println(it.toString()));
    }
}
