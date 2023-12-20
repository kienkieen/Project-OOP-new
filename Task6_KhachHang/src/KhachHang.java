public class KhachHang {
    private String cMND;
    private String name;
    private String gaDen;
    private double giaTien;

    public KhachHang(String cMND, String name, String gaDen, double giaTien) {
        this.cMND = cMND;
        this.name = name;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGaDen() {
        return gaDen;
    }

    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString(){
        return "Khach Hang " +"[Name: "+name + "\t\tCMND: "+cMND + "\t\tGa Den: "+ gaDen + "\t\tGia Tien: "+giaTien + "]";
    }
}
