public class CarInfo {
    private String godVipusca;
    private String model;
    private String price;
    private String color;

    public CarInfo(String godVipusca, String model, String price, String color) {
        this.godVipusca = godVipusca;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getGodVipusca() {
        return godVipusca;
    }

    public void setGodVipusca(String godVipusca) {
        this.godVipusca = godVipusca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nCarInfo-" +
                "godVipusca='" + godVipusca + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '.';
    }
}
