package H_W2.TASK3;

public class Methods3 {
    int[] arr_numb;

    public Methods3(int[] arr_numb) {
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
        
    public Boolean test_equals() {
        Boolean test = false;
        for (int i = 0; i < arr_numb.length-1; i++) {
            if (arr_numb[i]==0)
                if (arr_numb[i+1]==0) {test = true;}}
        return test;
    }

}
