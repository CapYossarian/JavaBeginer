//Глава 6 рекурсия
class Factorial{
    int FactR(int i){
        if(i==1) return i;
        else return  i*FactR(i-1);
    }
    int FactI(int i){
        int n,result=1;
        for (n=1;n<=i;n++){
            result=result*n;
        }
        return result;
    }
}
public class Recursion {
    public static void main(String[] args) {
        Factorial Fact = new Factorial();
        System.out.println(Fact.FactR(3));
        System.out.println(Fact.FactI(3));
    }
}
