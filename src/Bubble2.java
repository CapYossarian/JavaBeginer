public class Bubble2 {
    public static void main(String[] args) {
        //Этот примет из книги - 45  циклов
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a,b,t;
        int loop_count=0;
        int size = nums.length;

        for (int num:nums) System.out.print(num+" ");
        System.out.println();
        for (a=1;a<size;a++){
            for (b=size-1;a<=b;b--){
                if (nums[b-1]>nums[b]){
                    t=nums[b];
                    nums[b]=nums[b-1];
                    nums[b-1]=t;
                }
                loop_count++;
            }
        }
        for (int num:nums) System.out.print(num+" ");
        System.out.println();
        System.out.println("loops="+loop_count);

    }
}
