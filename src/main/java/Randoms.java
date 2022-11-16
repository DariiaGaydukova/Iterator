import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int max;
    protected int min;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }


        @Override
        public Integer next() {
            return random.nextInt(max - min) + min + 1;
        }
    }
}
