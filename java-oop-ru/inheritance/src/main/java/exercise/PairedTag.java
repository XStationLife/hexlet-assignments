package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
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
        if (!body.isEmpty()) {
            builder.append(body);
        } else if (!children.isEmpty()) {
            for (Tag child : children) {
                builder.append(child.toString());
            }
        }
        builder.append("</");
        builder.append(getName());
        builder.append(">");
        return builder.toString();
    }
}
// END
