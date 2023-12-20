import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        QuanLyPhongHoc quanLy = new QuanLyPhongHoc();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.print("Enter control: ");
            int control = sc.nextInt();
            switch(control){
                case 0 -> {
                    return;
                }
                case 1 -> {
                    PhongHoc p1 = new PhongLyThuyet(2323, "A", 56.4, 12, true);
                    PhongHoc p2 = new PhongLyThuyet(2324, "B", 32.2, 12, true);
                    PhongHoc p3 = new PhongLyThuyet(2325, "C", 9.4, 13, false);
                    PhongHoc p4 = new PhongMayTinh(2326, "D", 23, 4, 60);
                    PhongHoc p5 = new PhongMayTinh(2327, "E", 12, 5, 7);
                    PhongHoc p6 = new PhongThiNghiem(2328, "F", 15, 10, "CNTT", 100, true);
                    PhongHoc p7 = new PhongThiNghiem(2329, "G", 119.9, 12, "QTKD", 120, false);
                    quanLy.themPhongHoc(p1);
                    quanLy.themPhongHoc(p2);
                    quanLy.themPhongHoc(p3);
                    quanLy.themPhongHoc(p4);
                    quanLy.themPhongHoc(p5);
                    quanLy.themPhongHoc(p6);
                    quanLy.themPhongHoc(p7);

                    quanLy.hienThiPhongHoc();

                }
                case 2 ->   quanLy.inPhongTieuChuan();
                case 3 -> {
                    System.out.print("Nhap vao ma phong hoc can tim kiem: ");
                    int maPhong = sc.nextInt();
                    if(quanLy.timKiemPhongHoc(maPhong) != null) {
                        System.out.println("Phong hoc tim kiem duoc la: ");
                        System.out.println(quanLy.timKiemPhongHoc(maPhong).toString());
                    }else{
                        System.out.println("Khong tim thay phong hoc "+maPhong);
                    }


                }
                case 4 -> {
                    quanLy.sapXepDayNha();
                    System.out.println("Phong hoc sau khi sap xep day nha giam dan la: ");
                    quanLy.hienThiPhongHoc();
                }
                case 5 -> {
                    quanLy.sapXepDienTich();
                    System.out.println("Phong hoc sau khi sap xep dien tich giam dan la: ");
                    quanLy.hienThiPhongHoc();
                }
                case 6 -> {
                    quanLy.sapXepSoBongDen();
                    System.out.println("Phong hoc sau khi sap xep so bong den tang dan la: ");
                    quanLy.hienThiPhongHoc();
                }
                case 7 -> {
                    System.out.print("Nhap vao ma phong: ");
                    int ma = sc.nextInt();
                    System.out.println("Nhap vao so may tinh");
                    int soMT = sc.nextInt();
                    quanLy.capNhatSoMayTinh(ma, soMT);

                }
                case 8 -> {
                    System.out.print("Nhap vao ma phong hoc can xoa: ");
                    int maPhong = sc.nextInt();
                    quanLy.xoaPhongHoc(maPhong);
                }
                case 9 ->   quanLy.tongSoPhongHoc();
                case 10 -> {
                    System.out.println("Danh sach phong may tinh co tren 60 may");
                    quanLy.inPhongMay60();
                }

            }
        }


    }
    public static void menu(){
        System.out.println("\t===========Danh Sach Bai Tap===========");
        System.out.println("Bai 1: Them va hien thi cac phong hoc");
        System.out.println("Bai 2: Hien thi cac phong hoc co dat tieu chuan hay khong");
        System.out.println("Bai 3: Tim kiem phong hoc bang ma phong");
        System.out.println("Bai 4: Sap xep giam dan theo cot day nha");
        System.out.println("Bai 5: Sap xep giam dan theo cot dien tich");
        System.out.println("Bai 6: Sap xep tang dan theo cot so bong den");
        System.out.println("Bai 7: Cap nhat so may tinh khi biet ma phong");
        System.out.println("Bai 8: Xoa phong khi biet ma phong. Lưu ý khi test chương\n" +
                "trình, khi xóa cần phải xác minh rằng có chắc chắn xóa không?");
        System.out.println("Bai 9: In ra tong so phong hoc");
        System.out.println("Bai 10: In ra so phong hoc co 60 may tinh");
        System.out.println("------------------------------------------");
    }
}