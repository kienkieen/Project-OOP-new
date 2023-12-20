public abstract class HangHoa {
    protected String id;
    protected String name;
    protected int number;
    protected double donGia;

    public HangHoa(String id, String name, int number, double donGia) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.donGia = donGia;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", donGia=" + donGia +
                '}';
    }

    // Phương thức trừu tượng tính tiền VAT
    abstract double tinhTienVAT();
}
