import java.util.ArrayList;

public class ManagerHanHoa {

    private final ArrayList<HangHoa> hangHoaArrayList;
    public ManagerHanHoa(){
        hangHoaArrayList = new ArrayList<>();
    }
    public void addHangHoa(HangHoa x){
        if(!hangHoaArrayList.contains(x)){
            hangHoaArrayList.add(x);
        }
    }
    public void showHangHoa(){
        hangHoaArrayList.forEach(it -> System.out.println(it.toString()));
    }
    public void inDanhSachHangHoa() {
        for (HangHoa hangHoa : hangHoaArrayList) {
            System.out.println("Mã hàng: " + hangHoa.id);
            System.out.println("Tên hàng: " + hangHoa.name);
            System.out.println("Số lượng tồn: " + hangHoa.number);
            System.out.println("Đơn giá: " + hangHoa.donGia);
            System.out.println("Tiền VAT: " + hangHoa.tinhTienVAT());
            System.out.println("--------------------");
        }
    }


}
