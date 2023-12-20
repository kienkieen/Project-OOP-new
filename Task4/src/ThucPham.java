import java.util.Date;

public class ThucPham extends HangHoa{
    private Date ngaySanXuat;
    private Date ngayHetHang;
    private String nhaCungCap;

    public ThucPham(String id, String name, int number, double donGia, Date ngaySanXuat, Date ngayHetHang, String nhaCungCap) {
        super(id, name, number, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHang = ngayHetHang;
        this.nhaCungCap = nhaCungCap;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHang() {
        return ngayHetHang;
    }

    public void setNgayHetHang(Date ngayHetHang) {
        this.ngayHetHang = ngayHetHang;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    // Override phương thức tính tiền VAT
    @Override
    double tinhTienVAT(){
        return donGia*0.05;
    }

    @Override
    public String toString() {
        return "ThucPham{" +
                "ngaySanXuat=" + ngaySanXuat +
                ", ngayHetHang=" + ngayHetHang +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", donGia=" + donGia +
                '}';
    }
}
