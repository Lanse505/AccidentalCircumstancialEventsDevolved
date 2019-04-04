package lanse505.aced.common.base;

public enum EnumTask {
    BREAK_BLOCK("BREAK_BLOCK"),
    PLACE_BLOCK("PLACE_BLOCK");

    private final String text;

    EnumTask(String text) {
        this.text = text;
    }

    public String toString() {
        return this.text;
    }

}
