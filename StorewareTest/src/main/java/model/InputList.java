package model;

import java.util.List;

public class InputList {

    private List<Calculation> calculation;

    public InputList(List<Calculation> calculation) {
        this.calculation = calculation;
    }

    @Override
    public String toString() {
        return "InputList {" +
                "calculation=" + calculation +
                '}';
    }
}
