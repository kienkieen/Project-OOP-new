public class PhongThiNghiem extends PhongHoc{
    private String thognTinChuyenNganh;
    private int sucChua;
    private boolean bonRua;

    public PhongThiNghiem(int maPhong, String dayNha, double dienTich, int soBongDen, String thognTinChuyenNganh, int sucChua, boolean bonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.thognTinChuyenNganh = thognTinChuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    public String getThognTinChuyenNganh() {
        return thognTinChuyenNganh;
    }

    public void setThognTinChuyenNganh(String thognTinChuyenNganh) {
        this.thognTinChuyenNganh = thognTinChuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isBonRua() {
        return bonRua;
    }

    public void setBonRua(boolean bonRua) {
        this.bonRua = bonRua;
    }

    @Override
    public String toString() {
        return "PhongThiNghiem{thognTinChuyenNganh = %s, sucChua = %d, bonRua = %s, maPhong = %d, dayNha = %s, dienTich = %s, soBongDen = %d}".formatted(thognTinChuyenNganh, sucChua, bonRua, maPhong, dayNha, dienTich, soBongDen);
    }
    public boolean trungBinhBongDen(){
        return getDienTich() / getSoBongDen() <= 10;
    }
    @Override
    public String phongDatChuan(){
        if(trungBinhBongDen() && isBonRua()){
            return "Phong Dat Tieu Chuan";
        }
        return "Phong Khong Dat Tieu Chuan";
    }
}
