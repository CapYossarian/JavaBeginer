interface Series{
    //не делаю public, чтоб не размещать в отдельном файле
    int getNext();
    void reset();
    void setStart(int i);
    default void reset(int i){
        System.out.println("Заглушка");
    }
}
class ByTwos implements Series{
    private int start;
    private int val = +2;
    public int getNext() {
        val+=2;
        return val;
    }
    public void reset(){
        val=0;
        start=0;
    }
    public void reset(int i) {
        val=i;
        start=i;
    }

    public void setStart(int i) {
        start=i;
        val=i;
    }
    public int getStart(){
        return start;
    }
}
public class UseSeriesInterface {
    public static void main(String[] args) {
        ByTwos s = new ByTwos();
        s.setStart(0);
        System.out.println("Начальное занчение: "+ s.getStart());
        for (int i=0;i<5;i++){
            System.out.println("Следующее занчение ==>"+s.getNext());
        }
        System.out.println();
        s.reset();
        System.out.println("Начальное занчение после сброса: "+ s.getStart());
        s.setStart(1000);
        System.out.println("Установим новое начальное значение:" + s.getStart());
        for (int i=0;i<5;i++){
            System.out.println("Следующее занчение ==>"+s.getNext());
        }
        System.out.println();
        s.reset(5000);
        System.out.println("Начальное занчение после сброса c параметром: "+ s.getStart());
        for (int i=0;i<5;i++){
            System.out.println("Следующее занчение ==>"+s.getNext());
        }

    }

}
