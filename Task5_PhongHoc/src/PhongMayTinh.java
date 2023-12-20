public class PhongMayTinh extends PhongHoc{
    private int soMayTinh;

    public PhongMayTinh(int maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String toString() {
        return "PhongMayTinh{soMayTinh = %d, maPhong = %d, dayNha = %s, dienTich = %s, soBongDen = %d}".formatted(soMayTinh, maPhong, dayNha, dienTich, soBongDen);
    }
    public boolean trungBinhBongDen(){
        return getDienTich() / getSoBongDen() <= 10;
    }
    public boolean trungBinhMayTinh(){
        return getDienTich() / getSoMayTinh() <= 1.5;
    }
    @Override
    public String phongDatChuan(){
        if(trungBinhBongDen() && trungBinhMayTinh()){
            return "Phong Dat Tieu Chuan";
        }
        return "Phong Khong Dat Tieu Chuan";
    }

}
