package OPP.Lesson4.shields;

public class Wood implements Shield {
    @Override
    public int getDefence() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Wood: %d", getDefence());
    }
}
