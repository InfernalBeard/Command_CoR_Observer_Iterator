import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random randomIterator;
    protected int min, max;

    public Randoms(int min, int max) {
        this.randomIterator = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int i = max - min + 1;
                return randomIterator.nextInt(Math.abs(i)) + min;
            }
        };
    }
}
