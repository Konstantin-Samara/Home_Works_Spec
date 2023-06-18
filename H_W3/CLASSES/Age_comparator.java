package CLASSES;

import java.util.Comparator;

public class Age_comparator<Worker> implements Comparator<CLASSES.Worker> {
    @Override
    public int compare(CLASSES.Worker o1, CLASSES.Worker o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
