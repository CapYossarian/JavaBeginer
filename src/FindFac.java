public class FindFac {
    public static void main(String[] args) {
        int itcount=0;
        for (int i=2; i<=20; i++ ){
            System.out.print("Делители числа " + i+":");
            for (int j=2 ; j<= i/2; j++){ //делитель не может превышать величины половина делимого
                //Задача- уменьшить количество итераций
                if ((i%j) == 0) System.out.print(j+" ");
                itcount++;
            }
            System.out.println();
        }
        System.out.println("Итераций "+itcount);
        System.out.println();
        System.out.println();
    }
}
