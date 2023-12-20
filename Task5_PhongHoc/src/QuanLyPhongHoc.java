import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLyPhongHoc {
    private final ArrayList<PhongHoc> phongHocs;

    public QuanLyPhongHoc(){
        this.phongHocs = new ArrayList<>();
    }
    public void themPhongHoc(PhongHoc x){
        if(!phongHocs.contains(x)){
            phongHocs.add(x);
        }
    }
    public void hienThiPhongHoc(){
        phongHocs.forEach(it-> System.out.println(it.toString()));
    }
    public void inPhongTieuChuan(){
        for(PhongHoc x : phongHocs){
            System.out.println("Ma Phong: "+ x.maPhong);
            System.out.println("Day Phong: "+ x.dayNha);
            System.out.println("Dien Tich: "+ x.dienTich);
            System.out.println("Bong Den: "+ x.soBongDen);
            System.out.println("Tieu Chuan: "+ x.phongDatChuan());
            System.out.println("----------------------------------------");
        }
    }

    public PhongHoc timKiemPhongHoc(int maPhong){
        for(PhongHoc x : phongHocs){
            if(x.getMaPhong() == maPhong) {
                return x;
            }
        }
        return null; // Trả về null nếu không tìm thấy phòng với mã phòng tương ứng
    }
    public void sapXepDayNha(){
        phongHocs.sort(Comparator.comparing(PhongHoc::getDayNha).reversed());
    }
    public void sapXepDienTich(){
        phongHocs.sort(Comparator.comparing(PhongHoc::getDienTich).reversed());
    }
    public void sapXepSoBongDen(){
        phongHocs.sort(Comparator.comparing(PhongHoc::getSoBongDen));
    }
    public void capNhatSoMayTinh(int maPhong, int soMayTinhMoi){
        for(PhongHoc x : phongHocs){
            if(x instanceof PhongMayTinh && x.getMaPhong() == maPhong){
                PhongMayTinh pMT = (PhongMayTinh) x;
                pMT.setSoMayTinh(soMayTinhMoi);
                System.out.println("Đã cập nhật số máy tính cho phòng " + maPhong + " thành " + soMayTinhMoi + " máy tính.");
                return;
            }
        }
        System.out.println("Khong tim thay ma phong " +maPhong);
    }
    public void xoaPhongHoc(int maPhong){
        // Tim phong hoc can xoa
        PhongHoc phongHocCanXoa = null;
        for(PhongHoc x : phongHocs){
            if(x.getMaPhong() == maPhong){
                phongHocCanXoa = x;
                break;
            }
        }
        if(phongHocCanXoa != null){
            System.out.println("Ban co chan muon xoa phong hoc "+maPhong +" Yes/No");
            boolean xacNhan = xacNhanXoa();
            if(xacNhan){
                phongHocs.remove(phongHocCanXoa);
                System.out.println("Da xoa thanh cong phong hoc " +maPhong);
            }else{
                System.out.println("Khong xoa phong");
            }
        }else{
            System.out.println("Khong tim thay phong hoc "+maPhong);
        }
    }
    // Xac nhan co xoa phong hoc hay khong
    public boolean xacNhanXoa(){
        Scanner scanner = new Scanner(System.in);
        // Chuyen chuoi nhap vao thanh chu thuong
        String luaChon = scanner.nextLine().toLowerCase();
        return luaChon.equals("yes");
    }
    public void tongSoPhongHoc(){
        int phongLT = 0;
        int phongMT = 0;
        int phongTN = 0;
        for(PhongHoc x : phongHocs){
            if(x instanceof PhongLyThuyet){
                phongLT++;
            }
            else if(x instanceof PhongMayTinh){
                phongMT++;
            }
            else if(x instanceof PhongThiNghiem){
                phongTN++;
            }
        }
        System.out.println("Tong so phong hoc la: "+(phongLT + phongMT + phongTN));
        System.out.println("-------------------------------------");
        System.out.println("Tong so phong ly thuyet la: "+phongLT);
        System.out.println("Tong so phong may tinh la: "+phongMT);
        System.out.println("Tong so phong thi nghiem la: "+phongTN);
        System.out.println("-------------------------------------");
    }
    public void inPhongMay60(){
        for(PhongHoc x : phongHocs){
            if(x instanceof PhongMayTinh){
                PhongMayTinh pmt = (PhongMayTinh) x;
                if(pmt.getSoMayTinh() >= 60){
                    System.out.println(pmt);
                }
            }
        }
    }
}
