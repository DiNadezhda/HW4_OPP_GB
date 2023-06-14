package OPP.Lesson4.shields;

public class Fiery implements Shield {

    @Override
    public int getDefence() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("Fierly: %d", getDefence());
    }
}
