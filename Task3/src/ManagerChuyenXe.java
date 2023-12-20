import java.util.ArrayList;
import java.util.List;

public class ManagerChuyenXe {
    private List<ChuyenXe> chuyenXeList;
    public ManagerChuyenXe(){
        this.chuyenXeList = new ArrayList<>();
    }
    public void add(ChuyenXe x){
        this.chuyenXeList.add(x);
    }
    public void show(){
        this.chuyenXeList.forEach(it -> System.out.println(it.toString()));
    }

}
