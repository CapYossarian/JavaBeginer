public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        int [] dataset = new int [100];//{1,2,3,4,5,6,7,8,9,10};
        int summ = 0;
        for (int i=0;i<dataset.length;){
            dataset[i]=++i;
        }
        for (int currelement:dataset) {
            summ+=currelement;
        }
        for (int i: dataset) System.out.print(i+" ");
        System.out.println();
        System.out.println(summ);

    }
}
