import java.util.Scanner;

public class ChuyenXe {
    protected String MaSc, NameTx, SoX;
    protected double DoanhThu;

    public ChuyenXe(String maSc, String nameTx, String soX, double doanhThu) {
        MaSc = maSc;
        NameTx = nameTx;
        SoX = soX;
        DoanhThu = doanhThu;
    }
    public ChuyenXe(){

    }

    public String getMaSc() {
        return MaSc;
    }

    public void setMaSc(String maSc) {
        MaSc = maSc;
    }

    public String getNameTx() {
        return NameTx;
    }

    public void setNameTx(String nameTx) {
        NameTx = nameTx;
    }

    public String getSoX() {
        return SoX;
    }

    public void setSoX(String soX) {
        SoX = soX;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        DoanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "MaSc='" + MaSc + '\'' +
                ", NameTx='" + NameTx + '\'' +
                ", SoX='" + SoX + '\'' +
                ", DoanhThu=" + DoanhThu +
                '}';
    }
}
