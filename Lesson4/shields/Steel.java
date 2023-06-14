package OPP.Lesson4.shields;

public class Steel implements Shield {
    @Override
    public int getDefence() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Steel: %d", getDefence());
    }
}
