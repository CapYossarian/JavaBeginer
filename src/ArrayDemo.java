public class ArrayDemo {
    //просто объявление и использование массивов
    //length - переменная экземпляра массива
    public static void main(String[] args) {
        int sample[] = new int[10];
        int [] sampleval = {1,2,3,4,5}; //альтернативная форма записи
        int sample2dim[][] = {{1,2,3},{4,5,6}};
        for (int i=0;i<sample.length;i++)
            sample[i]=i;
        for (int i=0; i<sample.length;i++)
            System.out.print(sample[i]+" ");
        System.out.println();
        for (int i=0; i<sampleval.length;i++)
            System.out.print(sampleval[i]+" ");
        System.out.println();
        for( int i=0; i<sample2dim.length; i++){
            for (int j=0; j<sample2dim[i].length;j++)
                System.out.print(sample2dim[i][j]+" ");
            System.out.println();
        }
    }
}
