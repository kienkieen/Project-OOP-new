public class PhongLyThuyet extends PhongHoc{
    private boolean mayChieu;

    public PhongLyThuyet(int maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayChieu = mayChieu;

    }
    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }

    @Override
    public String toString() {
        return "PhongLyThuyet{mayChieu = %s, maPhong = %d, dayNha = %s, dienTich = %s, soBongDen = %d}".formatted(mayChieu, maPhong, dayNha, dienTich, soBongDen);
    }
    public boolean trungBinhBongDen(){
        return getDienTich() / getSoBongDen() <= 10;
    }

    @Override
    public String phongDatChuan(){
        if(trungBinhBongDen() && isMayChieu()){
            return "Phong Dat Tieu Chuan";
        }
        return "Phong Khong Dat Tieu Chuan";
    }

}
