import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Randoms randomInterator = new Randoms(90, 100);
        Iterator<Integer> iteratorR = randomInterator.iterator();
        while (iteratorR.hasNext()) {
            Integer r = iteratorR.next();
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим.");
                break;
            }
        }
    }
}