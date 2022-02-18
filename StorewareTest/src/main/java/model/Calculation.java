package model;

public class Calculation {

    private String function ;
    private Double number;

    public Calculation() {
    }

    public Calculation(String function, Double number) {
        this.function = function;
        this.number = number;
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

    @Override
    public String toString() {
        return "Calculation{" +
                "function='" + function + '\'' +
                ", number=" + number +
                '}';
    }
}
