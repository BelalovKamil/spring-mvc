package web.model;

public class Car {
    private final String model;
    private final int yearOfIssue;
    private final double engineVolume;

    public Car(String model, int yearOfIssue, double engineVolume) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
