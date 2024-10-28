package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = storage.toMap();

        for (Map.Entry<String, String> entry : data.entrySet()) {
            storage.set(entry.getValue(), entry.getKey());
            storage.unset(entry.getKey());
        }
    }
}
// END
