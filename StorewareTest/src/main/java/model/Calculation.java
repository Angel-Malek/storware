package model;

public class Calculation {

    private String function ;
    private Double number;
    private Double startingNumber;
    private Double finalSum;

    public Calculation() {
    }

    public Calculation(String function, Double number, Double startingNumber, Double finalSum) {
        this.function = function;
        this.number = number;
        this.startingNumber = startingNumber;
        this.finalSum = finalSum;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getStartingNumber() {
        return startingNumber;
    }

    public void setStartingNumber(Double startingNumber) {
        this.startingNumber = startingNumber;
    }

    public Double getFinalSum() {
        return finalSum;
    }

    public void setFinalSum(Double finalSum) {
        this.finalSum = finalSum;
    }
}
