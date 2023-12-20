import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main_t4 {
    public static void main(String[] args) {
        ManagerHanHoa managerHanHoa = new ManagerHanHoa();

        try {
            HangHoa thucPham = new ThucPham("TP001", "Thực phẩm 1", 100, 10.0,
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"),
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2022"), "Nhà cung cấp A");
            managerHanHoa.addHangHoa(thucPham);

            HangHoa dienMay = new DienMay("DM001", "Điện máy 1", 5, 100.0, 12, 1500);
            managerHanHoa.addHangHoa(dienMay);

            HangHoa sanhSu = new SanhSu("SS001", "Sành sứ 1", 60, 20.0,
                    "Nhà sản xuất B", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"));
            managerHanHoa.addHangHoa(sanhSu);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        managerHanHoa.showHangHoa();
        managerHanHoa.inDanhSachHangHoa();
    }
}
