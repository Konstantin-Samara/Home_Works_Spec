import CLASSES.Age_comparator;
import CLASSES.Boss;
import CLASSES.Salary_comparator;
import CLASSES.Worker;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setId(11);
        boss.setAge(53);
        boss.setPosition("BOSS");
        boss.setFirst_name("Ivan");
        boss.setLast_name("Petrov");
        boss.setSalary(100000);
        boss.setEducation("school");
        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker();
            worker.setId(i + 1);
            worker.setAge(65 - i * 5);
            worker.setSalary(35000 + i * 1000);
            worker.setPosition("Position" + (i + 1));
            worker.setFirst_name("First_Name" + (i + 1));
            worker.setLast_name("Last_Name" + (i + 1));
            workers.add(worker);
        }
        workers.add(boss);
// сортируем по возрасту- по возрастанию.
        workers.sort(new Age_comparator<>());
        print_list(workers);
// сортируем по з/п по убыванию.
        workers.sort(new Salary_comparator<>().reversed());
        print_list(workers);
// увеличиваем з/п на 5000 всем кроме начальника
        add_salary(workers, 5000);
        print_list(workers);

    }

    public static void add_salary(ArrayList<Worker> workers, int my_add) {
        for (int i = 0; i < workers.size(); i++) {
            if (!(workers.get(i) instanceof Boss)) {
                workers.get(i).setSalary(workers.get(i).getSalary() + my_add);
            }
        }
    }

    public static void print_list(ArrayList<Worker> workers) {
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i).toString());
        }
    }
}
