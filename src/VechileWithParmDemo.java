public class VechileWithParmDemo {
    public static void main(String[] args) {
        //класс с параметрами в отдельном файле
        VechileWithParam miniven = new VechileWithParam(7, 16, 21);
        VechileWithParam sportcar = new VechileWithParam(2, 12 ,12);

        System.out.println("Минивен перевезет " + miniven.passagers + " пассажиров на расстояние " + miniven.range() +" миль");
        System.out.println("Минивен перевезет " + sportcar.passagers + " пассажиров на расстояние " + sportcar.range() +" миль");

    }
}
