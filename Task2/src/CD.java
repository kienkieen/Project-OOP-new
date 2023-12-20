public class CD {
    public int id;
    public String nameCd;
    public String nameCaSy;
    public int number;
    public double money;

    public CD(int id, String nameCd, String nameCaSy, int number, double money) {
        this.id = id;
        this.nameCd = nameCd;
        this.nameCaSy = nameCaSy;
        this.number = number;
        this.money = money;
    }
    public CD(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCd() {
        return nameCd;
    }

    public void setNameCd(String nameCd) {
        this.nameCd = nameCd;
    }

    public String getNameCaSy() {
        return nameCaSy;
    }

    public void setNameCaSy(String nameCaSy) {
        this.nameCaSy = nameCaSy;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", nameCd='" + nameCd + '\'' +
                ", nameCaSy='" + nameCaSy + '\'' +
                ", number=" + number +
                ", money=" + money +
                '}';
    }
}
