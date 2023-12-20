public class ChuyenXeNoiThanh extends ChuyenXe{
    private String SoTuyen;
    private double SoKm;

    public ChuyenXeNoiThanh(String maSc, String nameTx, String soX, double doanhThu, String soTuyen, double soKm) {
        super(maSc, nameTx, soX, doanhThu);
        SoTuyen = soTuyen;
        SoKm = soKm;
    }


    public String getSoTuyen() {
        return SoTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        SoTuyen = soTuyen;
    }

    public double getSoKm() {
        return SoKm;
    }

    public void setSoKm(double soKm) {
        SoKm = soKm;
    }

    @Override
    public String toString() {
        return "Chuyen Xe Noi Thanh{" +
                "SoTuyen='" + SoTuyen + '\'' +
                ", SoKm=" + SoKm +
                ", MaSc='" + MaSc + '\'' +
                ", NameTx='" + NameTx + '\'' +
                ", SoX='" + SoX + '\'' +
                ", DoanhThu=" + DoanhThu +
                '}';
    }
}
