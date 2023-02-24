public class Bubble1 {
    public static void main(String[] args) {
        //Цимбалюк - 39 циклов - более эффективный
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int exchange_num=0;
        int sorted_pointer=nums.length-1;
        int buffer;
        int loop_count=0;
        for (int num:nums) System.out.print(num+" ");
        System.out.println();
        do {
            exchange_num=0;
            for (int i=0;i<sorted_pointer;i++){
                if (nums[i]>nums[i+1]) {
                    buffer=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=buffer;
                    exchange_num++;
                }
                loop_count++;
            }
            sorted_pointer--;
        }while (exchange_num>0);
        for (int num:nums) System.out.print(num+" ");
        System.out.println();
        System.out.println("loops="+loop_count);

    }
}
