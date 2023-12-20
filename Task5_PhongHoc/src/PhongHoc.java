public abstract class PhongHoc {
    protected int maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(int maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }
    public int getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    public String getDayNha() {
        return dayNha;
    }
    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public int getSoBongDen() {
        return soBongDen;
    }
    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    @Override
    public String toString() {
        return "PhongHoc{maPhong = %d, dayNha = %s, dienTich = %s, soBongDen = %d}".formatted(maPhong, dayNha, dienTich, soBongDen);
    }

    public abstract String phongDatChuan();
}
