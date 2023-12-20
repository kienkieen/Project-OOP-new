import java.util.Scanner;

public class MainKhachHang {
    public static void main(String[] args) {
        menu();
        System.out.println();
        ManagerKhachHang managerKhachHang = new ManagerKhachHang();
        Scanner sc = new Scanner(System.in);
        KhachHang kh1 = new KhachHang("DFG379", "Le Trung Kien", "Ga Tuy Hoa", 56.8);
        KhachHang kh2 = new KhachHang("DJF372", "Vo Thi Ngoc Vien", "Ga Tuy Hoa", 23.8);
        KhachHang kh3 = new KhachHang("DGK782", "Nguyen Van A", "Ga Ha Noi", 38.3);
        KhachHang kh4 = new KhachHang("DHD231", "Tran Van B", "Ga Vung Tau", 12.5);
        managerKhachHang.themKhachHang(kh1);
        managerKhachHang.themKhachHang(kh2);
        managerKhachHang.themKhachHang(kh3);
        managerKhachHang.themKhachHang(kh4);

        while (true) {
            System.out.println("Enter control: ");
            int control = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (control) {
                case 0:
                    return;
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhap vao so luong khach hang can them moi");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    for (int i = 0; i < n; i++) {
                        System.out.println("Khach Hang " + (i + 1) + ": ");
                        System.out.print("Nhap vao CMND: ");
                        String cmnd = scanner.nextLine();
                        System.out.print("Nhap vao Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhap vao Ga Den: ");
                        String gaDen = scanner.nextLine();
                        double giaTien;

                        while (true) {
                            System.out.print("Nhap vao Gia Tien: ");
                            try {
                                giaTien = Double.parseDouble(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Vui lòng nhập một số hợp lệ.");
                            }
                        }

                        KhachHang khachHang = new KhachHang(cmnd, name, gaDen, giaTien);
                        managerKhachHang.themKhachHang(khachHang);
                    }
                    break;
                case 2:
                    managerKhachHang.banVe();
                    break;
                case 3:
                    managerKhachHang.hienThiThongTin();
                    break;
                case 4:{
                    System.out.print("Nhap vao ten cua khach hang can xoa: ");
                    String name = sc.nextLine();
                    managerKhachHang.xoaKhachHang(name);
                }break;
                case 5:{
                    System.out.println("====Danh Sach Khach Hang Mua Ve====");
                    managerKhachHang.hienThiDanhSachMuaVe();
                }break;
                case 6:{
                    managerKhachHang.luuDanhSachVaoTXT("danhSachLuuFile.txt");
                    managerKhachHang.luuKhachHangMuaVe("KhachHangMuaVe.txt");
                }break;
                case 7:{
                    managerKhachHang.hienThiGaChoMuaVe();
                }break;
                case 8:{
                    managerKhachHang.hienThiGaChoMuaVeVaSoVeTuongUng();
                }break;
            }
        }
    }

    public static void menu() {
        System.out.println("==============MENU==============");
        System.out.println("1. Thêm một khách hàng mới vào hàng đợi mua vé");
        System.out.println("2. Bán một vé cho khách hàng. Chỉ bán cho người đăng ký trước.");
        System.out.println("3. Hiển thị danh sách khách hàng");
        System.out.println("4. Hủy một khách hàng ra khỏi danh sách. (khách hàng không mua vé nữa)");
        System.out.println("5. Hiển thị danh sách mua vé");
        System.out.println("6. Lưu danh sách vào file txt");
        System.out.println("7. Hiển thị danh sách các ga đang chờ mua vé");
        System.out.println("8. Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng cho ga");
        System.out.println("CLICK 0 ---------------------> OUT");
    }
}
