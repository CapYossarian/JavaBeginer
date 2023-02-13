public class Break2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore;
        System.out.println("q-Выход");
        for (;;){
            ch= (char) System.in.read();
            do {
                ignore= (char) System.in.read();
            } while (ignore!='\n');
            if (ch=='q'){
                System.out.println("q Нажата. Выходим.");
                break;
            }
        }
        System.out.println("Пока!!!");
    }
}
