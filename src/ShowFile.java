import java.io.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        //Проверка входного параметра строки запуска
        if (args.length!=1){
            System.out.println("Параметры запуска ShowFile <ИмяФайла>");
            return;
        }
        //try с ресурсами
        try (FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i!=-1);
            System.out.println();
        } catch (IOException exc){
            System.out.println("Ошибка ввода-вывода "+exc);
        }

    }
}
