package mapper;

import dto.ObjectDTO;
import model.Calculation;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {

    private final static String ADD = "add";
    private final static String APPLY = "apply";
    private final static String MULTIPLY = "multiply";
    private final static String DIVIDE = "divide";

    public ObjectMapper() {
    }

    public static List<ObjectDTO> createObjectDto(List<Calculation> calculations) {

        List<ObjectDTO> objectDTOS = new ArrayList<>();

        for (Calculation calculation : calculations) {
            ObjectDTO objectDTO = new ObjectDTO();
            objectDTO.setFunction(calculation.getFunction());
            objectDTO.setStartingNumber(getStartingNumber(calculations));
            objectDTO.getFinalSum(getFinalSum(calculations));

        }
        return objectDTOS;
    }


    private static Double getStartingNumber(List<Calculation> calculations) {
        Double result = 0.0;
        for (Calculation calculation : calculations) {
            if (calculation.getFunction().equals(APPLY)) {
                result = calculation.getNumber();
            }
        }
        return result;
    }

    public static Double getFinalSum(List<Calculation> calculations) {
        Double result = getStartingNumber(calculations);
        for (Calculation calculation : calculations) {
            if (calculation.getFunction().equals(ADD)) {
                result += calculation.getNumber();
            } else if (calculation.getFunction().equals(MULTIPLY)){
                result*= calculation.getNumber();
            }else if (calculation.getFunction().equals(DIVIDE)){
                result /= calculation.getNumber();
            }
        }
        return result;
    }







}
