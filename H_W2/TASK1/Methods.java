package H_W2.TASK1;

public class Methods {
    int[] arr_numb;

    public Methods(int[] arr_numb) {
        this.arr_numb = arr_numb;}

    public int countEvens() {
        int count = 0;
        for (int i = 0; i < arr_numb.length; i++) {
            if (arr_numb[i]%2==0){count++;}}
        return count;}

    public String toString() {
        String s = "[ ";
        String s1 = ", ";
        for (int i = 0; i < arr_numb.length; i++) {
            if (i==arr_numb.length-1) {s1 = "";}
            s = s+arr_numb[i]+s1;}
        s = s+" ]";
        return s;}
}
