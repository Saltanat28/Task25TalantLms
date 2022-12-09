public class Car {
    private String ID;
    private String numerAvto;

    public Car(String ID, String numerAvto) {
        this.ID = ID;
        this.numerAvto = numerAvto;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNumerAvto() {
        return numerAvto;
    }

    public void setNumerAvto(String numerAvto) {
        this.numerAvto = numerAvto;
    }

    @Override
    public String toString() {
        return "Car-" +
                "ID='" + ID + '\'' +
                ", numerAvto='" + numerAvto + '\'' +
                '.';
    }
}
