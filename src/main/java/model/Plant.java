package model;

public class Plant {
    private String name;
    private String color;
    private String stemColor;
    private int lifeTime;
    private double price;
    private Object object = new Size();  // так? Сделать в качестве поля Plant объект класса Size

    public Plant() {
    }

    public Plant(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Plant(String name, String color, String stemColor, int lifeTime, double price) {
        this.name = name;
        this.color = color;
        this.stemColor = stemColor;
        this.lifeTime = lifeTime;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод увеличения поля (любого) растения на заданную величину в аргументах
    public double evalPrice(double value){
        this.price += value;
        return this.price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getStemColor() {
        return stemColor;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", stemColor='" + stemColor + '\'' +
                ", lifeTime=" + lifeTime +
                ", price=" + price +
                '}';
    }
}
