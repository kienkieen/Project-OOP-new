import java.util.Date;

public class SanhSu extends HangHoa{
    private String nhaCungCap;
    private Date ngayNhapKho;

    public SanhSu(String id, String name, int number, double donGia, String nhaCungCap, Date ngayNhapKho) {
        super(id, name, number, donGia);
        this.nhaCungCap = nhaCungCap;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String toString() {
        return "SanhSu{" +
                "nhaCungCap='" + nhaCungCap + '\'' +
                ", ngayNhapKho=" + ngayNhapKho +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", donGia=" + donGia +
                '}';
    }

    @Override
    double tinhTienVAT(){
        return donGia*0.1;
    }
}
