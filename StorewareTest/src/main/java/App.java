import mapper.ObjectMapper;

import service.ObjectService;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        new ObjectService().prepareData();
        new ObjectMapper();
    }
}