package mapper;

import model.Calculation;

import java.util.List;

public class ObjectMapper {

    private final static String ADD = "add";
    private final static String APPLY = "apply";
    private final static String MULTIPLY = "multiply";
    private final static String DIVIDE = "divide";

    private Double getStartingNumber(List<Calculation> calculations) {
        Double result = 0.0;
        for (Calculation calculation : calculations) {
            if (calculation.getFunction().equals(APPLY)) {
                result = calculation.getNumber();
            }
        }
        return result;
    }

    public Double getFinalSum(List<Calculation> calculations) {
        Double result = getStartingNumber(calculations);
        for (Calculation calculation : calculations) {

            switch (calculation.getFunction()) {
                case ADD -> result += calculation.getNumber();
                case MULTIPLY -> result *= calculation.getNumber();
                case DIVIDE -> result /= calculation.getNumber();
            }
        }
        return result;
    }

}