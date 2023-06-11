package H_W2.TASK3;
// Написать функцию, возвращающую истину, если в переданном массиве 
// есть два соседних элемента, с нулевым значением.

public class Task3 {
    public static void main(String[] args) {
        int[] arr_numb = {1,2,3,4,5,6,7,8};
        Methods3 met = new Methods3(arr_numb);
        if (met.test_equals()) {
            System.out.println("\nВ заданном массиве "+met.toString()
            +"\nесть соседние элементы с нулевым значением.\n");}
        else {
            System.out.println("\nВ заданном массиве "+met.toString()
            +"\nнет соседних элементов с нулевым значением.\n");}}
}
