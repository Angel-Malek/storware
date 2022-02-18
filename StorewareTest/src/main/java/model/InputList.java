package model;

import java.util.List;

public class InputList {

    private List<Calculation> calculation;

    public InputList(){
    }

    public InputList(List<Calculation> calculation) {
        this.calculation = calculation;
    }

    public List<Calculation> getCalculation() {
        return calculation;
    }

    public void setCalculation(List<Calculation> calculation) {
        this.calculation = calculation;
    }

    @Override
    public String toString() {
        return "InputList {" +
                "calculation=" + calculation +
                '}';
    }
}
