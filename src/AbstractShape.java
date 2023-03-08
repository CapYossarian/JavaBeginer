abstract class TwoDShape{
    private double width;
    private double height;
    private String name;
    //конструктор по умолчанию
    TwoDShape(){
        width=height=0;
        name="none";
    }
    //конструктор параметризованный
    TwoDShape(double w, double h, String n){
        width=w;
        height = h;
        name = n;
    }
    //конструктор одинаковые значения
    TwoDShape(double w, String n){
        width=height=w;
        name = n;
    }
    //один на основе другого
    TwoDShape(TwoDShape s){
        width=s.width;
        height=s.height;
        name=s.name;
    }
    //методы доступа к переменным
    void setWidth(double w){
        width=w;
    }
    void setHeight(double h){
        height=h;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    void showDim(){
        System.out.println("Фигура "+name+" Высота и шиирина:" + height+" и "+width);
    }
    abstract double area();
}
class Circle extends TwoDShape{
    Circle(){
        super();
    }
    Circle(double r){
        super(r,"круг");
    }
    Circle(Circle c){
        super(c);
    }
    double area(){
        return Math.pow(getWidth()/2,2)*Math.PI;
    }
}
public class AbstractShape {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        c.showDim();
        System.out.println("Площадь "+c.area());
    }

}
