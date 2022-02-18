package service;

import dto.ObjectDTO;
import mapper.ObjectMapper;
import model.Calculation;
import model.InputList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ObjectService {

    public InputList inputList = new InputList();

    public void prepareData() throws IOException {
        File file = new File(
                Objects.requireNonNull(getClass().getClassLoader().getResource("file.txt")).getFile()
        );

        Path path = Paths.get(String.valueOf(file));
        Stream<String> inputList = Files.lines(path);

        List<String> objectList = inputList.collect(Collectors.toList());

        Calculation calculation = new Calculation();

        for (int i = 0; i <objectList.size(); i++) {
            String[] parts = objectList.get(i).split(" ");
            String function = parts[0];
            String number = parts[1];
            System.out.println(function + " " + number);

            calculation.setFunction(function);
            calculation.setNumber(Double.parseDouble(number));

        //    System.out.println(ObjectMapper);

        }

        System.out.println(ObjectMapper.createObjectDto((List<Calculation>) calculation));

    }




}
