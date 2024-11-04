package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    protected String attributesToString(Map<String, String> attributes) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            builder.append(entry.getKey());
            builder.append("=\"");
            builder.append(entry.getValue());
            builder.append("\" ");
        }
        return builder.toString().trim();
    }

}
// END
