package TASK2;

import java.io.*;
import java.util.Scanner;

public class Models {
    private static String[] item = {" ","X","O","P"};

    public static String[][] intToField(int numb) {
        String[][] field = new String[3][3];
        String str = String.valueOf(numb);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = item[Integer.valueOf(String.valueOf(str.charAt(i*3+j+1)))];
            }
        }
        return field;}
    public static int fieldToInt(String[][] field){
        String str = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < item.length; k++) {
                    if (field[i][j].equals(item[k])){
                        str = str+String.valueOf(k);
                    }
                }
                }
        }
        str = "1"+str;
        return Integer.valueOf(str);
    }
    public static void printField(String[][] field){
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j]);
                if (j<2){System.out.print(" | ");}
            }
            if (i<2){System.out.println("\n-----------");}
        }
        System.out.println();
    }
    public static void my_write(int numb) {
        try {
            DataOutputStream writer = new DataOutputStream(new FileOutputStream(".//src//TASK2//file.txt"));
            writer.writeInt(numb);
            writer.close();
        }catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND IN WRITER");
        }catch (IOException e){
            System.out.println("I/O EXCEPTION IN WRITER");
        }
    }
    public static int my_read() {
        int numb = 0;
        try{
        DataInputStream reader = new DataInputStream(new FileInputStream(".//src//TASK2//file.txt"));
        numb = reader.readInt();
        reader.close();
        }catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND IN READER");
        }catch (IOException e){
            System.out.println("I/O EXCEPTION IN READER");
        }
        return numb;
    }
    public static int myInput(){
        boolean test = true;
        String str = "";
        Scanner scan = new Scanner(System.in);
        while (test) {
            test = false;
            System.out.print("Enter positions : ");
            scan = new Scanner(System.in);
            str = scan.nextLine();
            if (str.length() == 9) {
                for (int i = 0; i < 9; i++) {
                    if (!(str.charAt(i)>='0'&&str.charAt(i)<='3')){
                        System.out.println("Incorrect position of "+(i+1)+" (must enter \"0\"-\"3\"), try again.");
                        test = true;
                    }
                }
            }
            else {
                System.out.println("Incorrect count of fields (must enter 9 positions), try again.");
                test = true;
            }
        }
        scan.close();
        return Integer.valueOf("1"+str);
    }
}
