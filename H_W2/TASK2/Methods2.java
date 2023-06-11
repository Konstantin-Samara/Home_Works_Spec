package H_W2.TASK2;

public class Methods2 {
    int[] arr_numb;
    
    public Methods2(int[] arr_numb) {
        this.arr_numb = arr_numb;
    }

    public String toString() {
        String s = "[ ";
        String s1 = ", ";
        for (int i = 0; i < arr_numb.length; i++) {
            if (i==arr_numb.length-1) {s1 = "";}
            s = s+arr_numb[i]+s1;}
        s = s+" ]";
        return s;}

    public int[] extr() {
        int max = arr_numb[0];
        int min = arr_numb[0];
        for (int i = 1; i < arr_numb.length; i++) {
            if (max<arr_numb[i]){max = arr_numb[i];}
            if (min>arr_numb[i]){min = arr_numb[i];}}
        int[] ext = {max,min};
        return ext;
    }
}
