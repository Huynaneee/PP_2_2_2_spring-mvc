package web.model;

public class Car {
    private String model;
    private String color;
    private int yearProduction;

    public Car(String model, String color, int yearProduction) {
        this.model = model;
        this.color = color;
        this.yearProduction = yearProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }
}
