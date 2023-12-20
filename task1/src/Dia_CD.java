public class Dia_CD {
    private int id;
    private String name;
    private String nameCaSy;
    private int numberSong;
    private double money;
    public Dia_CD(int id, String name, String nameCaSy, int numberSong, double money) {
        this.id = id;
        this.name = name;
        this.nameCaSy = nameCaSy;
        this.numberSong = numberSong;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNameCaSy() {
        return nameCaSy;
    }

    public int getNumberSong() {
        return numberSong;
    }

    public double getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameCaSy(String nameCaSy) {
        this.nameCaSy = nameCaSy;
    }

    public void setNumberSong(int numberSong) {
        this.numberSong = numberSong;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return STR."Dia_CD{id=\{id}, name='\{name}\{'\''}, nameCaSy='\{nameCaSy}\{'\''}, numberSong=\{numberSong}, money=\{money}\{'}'}";
    }
}
