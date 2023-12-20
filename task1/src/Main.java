
public class Main{
    public static void main(String[] args) {
        System.out.println("Le Trung Kien");
        Manager_CD managerCd = new Manager_CD();
        Dia_CD diaCd = new Dia_CD(32, "Mot Ngay Hoc Code", "Le Trung Kien", 234, 45.5);
        managerCd.addCD(diaCd);
        managerCd.show();

    }
}