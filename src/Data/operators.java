package Data;

public enum operators {
  ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");
  String description;

    operators(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
