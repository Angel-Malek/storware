package dto;

public class ObjectDTO {

    private String function ;
    private Double number;
    private Double startingNumber;
    private Double finalSum;

    public ObjectDTO() {
    }

    public ObjectDTO(String function, Double number, Double startingNumber, Double finalSum) {
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

    public Double getFinalSum(Double finalSum) {
        return this.finalSum;
    }

    public void setFinalSum(Double finalSum) {
        this.finalSum = finalSum;
    }
}
