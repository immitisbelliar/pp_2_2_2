package web.model;


public class Car {

    private String model;
    private String series;
    private int yearOfProduction;

    public Car(){}

    public Car(String model, String series, int yearOfProduction) {
        this.model = model;
        this.series = series;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\n|| Series: " + series + "\n|| Production year: " + yearOfProduction;
    }
}
