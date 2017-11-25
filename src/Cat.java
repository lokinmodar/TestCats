import java.awt.*;

public class Cat implements Comparable<Cat> {
    Image image;
    int cuteness;

    @Override
    public int compareTo(Cat another) {
        return Integer.compare(cuteness, another.cuteness);
    }
}
