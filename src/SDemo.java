//Применение ключевого слова static глава 6
class StaticDemo{
    int x; // обычная переменная - член класса
    static int y;//статическая переменная
    int sum(){
        return x+y;
    }
}
public class SDemo {
    public static void main(String[] args) {
        StaticDemo s = new StaticDemo();
        StaticDemo.y=3;
        s.x=2;
        System.out.println("Сумма значений статической и обычной переменной = "+ s.sum());

    }
}
