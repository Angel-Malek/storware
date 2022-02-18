package service;

import mapper.ObjectMapper;
import model.Calculation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ObjectService {

    public void prepareData() throws IOException {
        File file = new File(
                Objects.requireNonNull(getClass().getClassLoader().getResource("file.txt")).getFile()
        );

        Path path = Paths.get(String.valueOf(file));
        Stream<String> inputList = Files.lines(path);

        List<String> objectList = inputList.collect(Collectors.toList());

        List<Calculation> calcList = new ArrayList<>();

        for (String s : objectList) {
            String[] parts = s.split(" ");
            String function = parts[0];
            String number = parts[1];

            Calculation calculation = new Calculation();
            calculation.setFunction(function);
            calculation.setNumber(Double.parseDouble(number));
            calcList.add(calculation);
        }

      //  calcList.forEach(System.out::println);
        ObjectMapper mapper = new ObjectMapper();
        Double result = mapper.getFinalSum(calcList);
        System.out.println("RESULT IS: " + result);
    }


}