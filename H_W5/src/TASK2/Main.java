//Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
//и представляют собой, например, состояния ячеек поля для игры в крестики-нолики,
//где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом,
//3 – резервное значение. Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
//Записать в файл 9 значений так, чтобы они заняли три байта.
//3 (*) - В продолжение 2 дописать "разворачивание" поля игры крестики-нолики из сохраненного
//в файле состояния (распарсить файл, в зависимости от значений (0-3) нарисовать
//поле со значками 'х' 'о' '.')

package TASK2;

public class Main {
    public static void main(String[] args) {
        /**
         запрашиваем пользовательский ввод значений ячеек игрового поля 3х3 построчно последовательно
         с проверкой на общее кол-во введенных значений - 9 и содержание 0-3 до тех пор, пока не
         будет осуществлен корректный ввод. Первым знаком сформированного int-а добавляется "1" - чтобы
         "не потерять" нули при переводе String(Scanner) в int (если нули - первые во введенной
         пользователем строке)
         */
        int numb = Models.myInput();

        /**
         * формируем String[][] со значениями " ","Х","О","Р"(парсим пользовательский int)
        */
        String[][] field = Models.intToField(numb);
        /**
         Отображаем игровое поле в терминале
         */
        System.out.println("Field from user Integer :");
        Models.printField(field);
        /**
         формируем Integer из String[3][3] для последующего сохранения в файл
         */
        System.out.println("\n"+Models.fieldToInt(field)+" - Integer for save from field");
        /**
         сохраняем в файл ".//src//TASK2//file.txt" через DataOutputStream.WriteInt()
         */
        Models.my_write(numb);
        /**
         читаем int из файла ".//src//TASK2//file.txt" через DataInputStream.ReadInt()
         */
        numb = Models.my_read();
        System.out.println(numb+" - readed Integer from file");
        if (numb>999999999){
            field = Models.intToField(numb);
            System.out.println("Field from readed Integer :");
            Models.printField(field);}
        else {System.out.println("SOMETHING WRONG READED");}


    }
}
