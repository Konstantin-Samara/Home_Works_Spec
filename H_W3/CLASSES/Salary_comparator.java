package CLASSES;

import java.util.Comparator;

public class Salary_comparator<Worker> implements Comparator<CLASSES.Worker> {

    @Override
    public int compare(CLASSES.Worker o1, CLASSES.Worker o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
