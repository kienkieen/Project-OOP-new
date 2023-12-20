public class DienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public DienMay(String id, String name, int number, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(id, name, number, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "DienMay{" +
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", congSuat=" + congSuat +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", donGia=" + donGia +
                '}';
    }

    @Override
    double tinhTienVAT() {
        return donGia*0.1;
    }
}
