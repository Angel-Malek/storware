import mapper.ObjectMapper;
import model.InputList;
import service.ObjectService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public String getGreeting() throws IOException {
        return "Hello World!";

//        InputList inputList = new InputList();
//
//      //  Stream<String>   = Files.lines(Paths.get("file.txt"));
//
//        inputList.equals(Files.lines(Path.of("file.txt")));



    }





    public static void main(String[] args) throws IOException {
        new ObjectService().prepareData();
        new ObjectMapper();
    }
}