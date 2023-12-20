import java.io.*;
import java.util.*;

public class ManagerKhachHang {
    protected LinkedList<KhachHang> khachHangs = new LinkedList<>();
    protected LinkedList<KhachHang> danhSachMuaVe = new LinkedList<>();
    public Scanner scanner = new Scanner(System.in);

    public ManagerKhachHang() {
        // Initialization, if needed
    }

    public void themKhachHang(KhachHang newkhachHang) {
        for(KhachHang x : khachHangs){
            if(x.getcMND().equals(newkhachHang.getcMND())){
                x.setGaDen(newkhachHang.getGaDen());
                x.setGiaTien(newkhachHang.getGiaTien());
                System.out.println("Đã cập nhật thông tin cho khách hàng có Số CMND: " + newkhachHang.getcMND());
                return;
            }
        }
        khachHangs.add(newkhachHang);
        System.out.println("Đã thêm khách hàng " + newkhachHang.getName() + " vào hàng đợi.");
    }

    public void hienThiThongTin() {
        khachHangs.forEach(it -> System.out.println(it.toString()));
    }
    public void hienThiDanhSachMuaVe(){
        danhSachMuaVe.forEach(it -> System.out.println(it.toString()));
    }

    public void banVe() {
        if (khachHangs.isEmpty()) {
            System.out.println("Khong co khach hang nao trong hang doi");
            return;
        }

        // Lấy khách hàng đầu tiên từ danh sách
        KhachHang khachHang = khachHangs.poll();

        // Hiển thị thông tin khách hàng và yêu cầu xác nhận bán
        System.out.println("Thong tin cua khach hang can mua ve");
        System.out.println(khachHang);

        System.out.println("Xac nhan ban ve cho khach hang nay? (Y/N)");

        char choose = scanner.next().charAt(0);

        if (choose == 'Y' || choose == 'y') {
            // Them vao danh sach khach hang da mua ve
            danhSachMuaVe.add(khachHang); // Them khach hamg mua ve vao sanh sach mua ve
            khachHangs.remove(khachHang); // Xoa khach hang khoi danh sach cho mua ve
            System.out.println("Ban ve thanh cong cho khach hang co ten " + khachHang.getName());
        } else {
            System.out.println("Huy Ban ve cho khach hang!");
            // Them vao dau danh sach khach hang
            khachHangs.addFirst(khachHang);
        }
    }
    public void xoaKhachHang(String name){
        for(KhachHang x : khachHangs){
            if(x.getName().equals(name)){
                khachHangs.remove(x);
                System.out.println("Da xoa thanh cong khach hang co ten "+ name +" ra khoi danh sach");
                return;
            }
        }
        System.out.println("Khong tim thay khach hang co ten "+name+" trong danh sach");
    }
    public void luuDanhSachVaoTXT(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (KhachHang customer : khachHangs) {
                // Format each customer's information and write to the file
                String customerInfo = String.format("%s | %s | %s | %.2f\n",
                        customer.getcMND(), customer.getName(), customer.getGaDen(), customer.getGiaTien());
                writer.write(customerInfo);
            }
            // Flush and close dam bao du leiu duoc ghi va dong dung cach
            writer.flush();
            writer.close();
            System.out.println("Danh sach khach hang da duoc luu vao file TXT: " + fileName);
        } catch (IOException e) {
            System.out.println("Loi khi luu danh sach khach hang vao file TXT: " + e.getMessage());
        }

    }
    public void luuKhachHangMuaVe(String fileName){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for(KhachHang x : danhSachMuaVe){
                String muaVe = String.format("%s | %s | %s | %.2f\n", x.getcMND(), x.getName(), x.getGaDen(), x.getGiaTien());
                writer.write(muaVe);
            }
            writer.flush();
            writer.close();
            System.out.println("Danh sach khach hang mua ve da duoc luu vao file TXT: " + fileName);
        }catch(IOException e){
            System.out.println("Loi khi luu danh sach mua ve vao file txt");
        }
    }
    public void hienThiGaChoMuaVe(){
        // Tao mot danh sach duyet qua cac ga
        Set<String> gaChoMuaVe = new HashSet<>();
        for(KhachHang x : khachHangs){
            gaChoMuaVe.add(x.getGaDen());
        }
        System.out.println("Danh Sach cac ga dang cho mua ve");
        for(String ga : gaChoMuaVe){
            System.out.println(ga);
        }
    }
    public void hienThiGaChoMuaVeVaSoVeTuongUng(){
        Map<String, Integer> soLuongVeTheoGa = new HashMap<>();
        // Duyet qua tung khach hang
        for(KhachHang x : khachHangs){
            String gaDen = x.getGaDen();
            // Tang so luong theo so ga tuong ung
            soLuongVeTheoGa.put(gaDen, soLuongVeTheoGa.getOrDefault(gaDen, 0)+1);
        }
        // Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng
        System.out.println("Danh sách các ga đang chờ mua vé và số vé tương ứng:");
        for(Map.Entry<String, Integer> entry : soLuongVeTheoGa.entrySet()){
            String ga = entry.getKey();
            int soLuongVe = entry.getValue();
            System.out.println("Ga: " + ga + ", Số vé: " + soLuongVe);
        }
    }

}