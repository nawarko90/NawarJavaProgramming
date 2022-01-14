package NawarPractice;

public class Car {
    public String carType, carColor, carModel;
    public int carYear,carPrince;
    public boolean isNew,isPretty;

    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                ", carPrince=" + carPrince +
                ", isNew=" + isNew +
                ", isPretty=" + isPretty +
                '}';
    }

    public void setInfo(String carType, String carColor, String carModel, int carYear, int carPrince, boolean isNew, boolean isPretty) {
        this.carType = carType;
        this.carColor = carColor;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carPrince = carPrince;
        this.isNew = isNew;
        this.isPretty = isPretty;


    }
}
