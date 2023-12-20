public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String NoiDen;
    private int SoNgay;

    public ChuyenXeNgoaiThanh(String maSc, String nameTx, String soX, double doanhThu, String noiDen, int soNgay) {
        super(maSc, nameTx, soX, doanhThu);
        NoiDen = noiDen;
        SoNgay = soNgay;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setNoiDen(String noiDen) {
        NoiDen = noiDen;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(int soNgay) {
        SoNgay = soNgay;
    }

    @Override
    public String toString() {
        return "Chuyen Xe Ngoai Thanh{" +
                "NoiDen='" + NoiDen + '\'' +
                ", SoNgay=" + SoNgay +
                ", MaSc='" + MaSc + '\'' +
                ", NameTx='" + NameTx + '\'' +
                ", SoX='" + SoX + '\'' +
                ", DoanhThu=" + DoanhThu +
                '}';
    }
}
