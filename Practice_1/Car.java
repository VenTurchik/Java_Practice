package Practice_1;

public class Car {
    private final int THIS_YEAR = 2026; // Текущий год
    
    private String model;       // Модель бибики
    private String license;     // Номер бибики
    private String color;       // Цвет бибики
    private int year;           // Год выпуска бибики

    public Car() { }

    public Car(String model) {
        this.model = model;
    }

    public Car(
        String model,
        String license,
        String color,
        int year
    ) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public void To_String() {
        System.out.println(model + " " + license + " " + " " + color + " " + year);
    }

    public int getCarAge() {
        return THIS_YEAR - year;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setLicense(String newLicense) {
        license = newLicense;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public int  getYear() {
        return year;
    }
    
}
