package H_W2.TASK2;
// Написать функцию, возвращающую разницу между самым большим и 
// самым маленьким элементами переданного не пустого массива.
public class Task2 {
    public static void main(String[] args) {
        int[] arr_numb = {1,2,3,4,5,6,7,8};
        Methods2 met = new Methods2(arr_numb);
        if (arr_numb.length>1){
            System.out.println("\nВ массиве "+met.toString()
            +"\nразница между MAX (" +met.extr()[0]+") и MIN ("+met.extr()[1]
            +") элементов : "+(met.extr()[0]-met.extr()[1])+"\n");}
        else {System.out.println("\nМассив должен содержать более одного элемента.\n");}
    }
}
