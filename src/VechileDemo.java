class Vechile{
    int passagers;
    int capfuel;
    int mpg;
    int range(){
        return this.mpg * this.capfuel;
    }
}

public class VechileDemo {
    public static void main(String[] args) {
        Vechile miniven = new Vechile();
        Vechile sportcar = new Vechile();
        int range1, range2;

        miniven.passagers =7;
        miniven.capfuel = 16;
        miniven.mpg = 21;
        range1 = miniven.capfuel*miniven.mpg;
        sportcar.passagers = 2;
        sportcar.capfuel = 12;
        sportcar.mpg = 12;
        range2 = sportcar.capfuel * sportcar.mpg;
        System.out.println("Минивен перевезет " + miniven.passagers + " пассажиров на расстояние " + range1 +" миль");
        System.out.println("Минивен перевезет " + sportcar.passagers + " пассажиров на расстояние " + range2 +" миль");
        //через метод
        System.out.println("Через метод");
        System.out.println("Минивен перевезет " + miniven.passagers + " пассажиров на расстояние " + miniven.range() +" миль");
        System.out.println("Минивен перевезет " + sportcar.passagers + " пассажиров на расстояние " + sportcar.range() +" миль");


    }
}
