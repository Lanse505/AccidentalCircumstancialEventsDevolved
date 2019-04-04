package lanse505.aced.common.base;

public enum EnumReward {
    DROPS_ADD("DROPS_ADD"),
    DROPS_REMOVE("DROPS_REMOVE"),
    DROPS_CLEAR("DROPS_CLEAR");

    private final String text;

    EnumReward(String text) {
        this.text = text;
    }

    public String toString() {
        return this.text;
    }
}
