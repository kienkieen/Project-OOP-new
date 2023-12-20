import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {
    private List<CD> cds;
   public Manager(){
       this.cds = new ArrayList<>();
   }
    public void add(CD x){
        this.cds.add(x);
    }
    public void show(){
        this.cds.forEach(it -> System.out.println(it.toString()));
    }
    public int sumCd(){
       return this.cds.stream().mapToInt(CD::getNumber).sum();
       //mapToInt() dung de anh xa toi cac doi tuong ta can xet
        // sum() dung de tinh tong cac doi tuong ta xet
    }
    public void sortIncrease(){
       // sap xep tang dan theo gia tien
       this.cds.sort(Comparator.comparingDouble(CD::getMoney));
    }
    public void sortReverse(){
        // sap xep giam dan theo gia tien
        this.cds.sort(Comparator.comparingDouble(CD::getMoney).reversed());
    }
}
