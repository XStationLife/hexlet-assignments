package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
// BEGIN
public class App {
    public static void save(Path path, Car car) {
        try {
            Files.write(path, car.serialize().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Car extract(Path path) {
        try {
            String json = Files.readString(path);
            return Car.deserialize(json);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
// END
