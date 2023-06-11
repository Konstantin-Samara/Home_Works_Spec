package H_W2.TASK1;

// Написать метод, возвращающий количество чётных элементов массива. 
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

public class Task1 {
    public static void main(String[] args) {
        int[] numb = {1,3,5};
        Methods met = new Methods(numb);

        System.out.println("\nВ массиве "+met.toString()
        +"\nкол-во четных элементов : "+met.countEvens()+"\n");}
}
