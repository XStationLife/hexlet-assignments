package exercise;

// BEGIN
class LabelTag implements TagInterface {
    private String text;
    private TagInterface childTag;

    public LabelTag(String text, TagInterface childTag) {
        this.text = text;
        this.childTag = childTag;
    }

    @Override
    public String render() {
        return "<label>" + text + childTag.render() + "</label>";
    }
}
// END
