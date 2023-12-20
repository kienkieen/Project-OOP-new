import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        menu();
        ManagerChuyenXe manager = getManagerChuyenXe();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter control: ");
            int control = sc.nextInt();
            switch (control){
                case 0 ->{
                   return;
                }
                case 1  -> manager.show();
            }
        }

    }

    public static void menu(){
        System.out.println("============MENU============");
        System.out.println("1. Hien thi danh sach cac chuyen xe");
        System.out.println("0. Exit(0)");
    }
    public static ManagerChuyenXe getManagerChuyenXe(){
        ManagerChuyenXe manager = new ManagerChuyenXe();
        ChuyenXe chuyenXe1 = new ChuyenXeNgoaiThanh("sdf", "Le Trung Kien", "G#384y", 34.5, "Phu Yen", 23);
        ChuyenXe chuyenXe2 = new ChuyenXeNgoaiThanh("ssf", "Vo Thi Ngoc Vien", "FGis73", 32.5, "Phu Yen", 22);
        ChuyenXe chuyenXe3 = new ChuyenXeNoiThanh("asf", "VVVVVVVVVVVV", "Fsd3", 31.5, "HCM", 22);
        ChuyenXe chuyenXe4 = new ChuyenXeNoiThanh("23sd", "LLLLLLLLLLL", "sdf72", 22.5, "HCM", 22);
        manager.add(chuyenXe1);
        manager.add(chuyenXe2);
        manager.add(chuyenXe3);
        manager.add(chuyenXe4);
        return manager;
    }
}