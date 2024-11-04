package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("<");
        builder.append(getName());
        if (!getAttributes().isEmpty()) {
            builder.append(" ");
            builder.append(attributesToString(getAttributes()));
        }
        builder.append(">");
        return builder.toString();
    }
}
// END
