
public class Main {
    public static void main(String[] args) {
//        Manager manager = new Manager();
//        CD cd1 = new CD(23, "Toi La Ai", "LE Trung Kien", 3434, 34.5);
//        CD cd2 = new CD(24, "Anh Hoc Code", "Vo Thi Ngoc Vien", 345, 35.6);
//        CD cd3 = new CD(25, "Lap Trinh Java", "Nguyen Van A", 3, 35);
//        CD cd4 = new CD(26, "Lap Trinh Kotlin", "Tran Thi B", 33, 23);
//        CD cd5 = new CD(27, "Lap Trinh C++", "Lam Minh C", 44,44);
//        CD cd6 = new CD(28, "Lap Trinh Python", "Le Thi D", 44, 24.5);
//        manager.add(cd1);
//        manager.add(cd2);
//        manager.add(cd3);
//        manager.add(cd4);
//        manager.add(cd5);
//        manager.add(cd6);
        Manager manager = getManager();
        manager.show();
        System.out.println("Tong so luong san pham la: "+manager.sumCd());
        System.out.println("Sap xep theo gia tien la: ");
        System.out.println("Sap xep tang dan");
        manager.sortIncrease();
        manager.show();
        System.out.println();
        System.out.println("Sap xep giam dan");
        manager.sortReverse();
        manager.show();

    }

    private static Manager getManager() {
        Manager manager = new Manager();
        CD cd1 = new CD(23, "Toi La Ai", "LE Trung Kien", 3434, 34.5);
        CD cd2 = new CD(24, "Anh Hoc Code", "Vo Thi Ngoc Vien", 345, 35.6);
        CD cd3 = new CD(25, "Lap Trinh Java", "Nguyen Van A", 3, 35);
        CD cd4 = new CD(26, "Lap Trinh Kotlin", "Tran Thi B", 33, 23);
        CD cd5 = new CD(27, "Lap Trinh C++", "Lam Minh C", 44,44);
        CD cd6 = new CD(28, "Lap Trinh Python", "Le Thi D", 44, 24.5);
        manager.add(cd1);
        manager.add(cd2);
        manager.add(cd3);
        manager.add(cd4);
        manager.add(cd5);
        manager.add(cd6);
        return manager;
    }
}