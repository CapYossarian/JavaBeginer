public class ExcDemo1 {
    public static void main(String[] args) {
        int [] nums= {1,3,17,47, 33, 200, 600};
        int [] denoms= {1,2,0,6,0};
        double result;
        try {
            for (int i = 0; i < nums.length; i++) {
                try {
                    //result = (double) nums[i] / (double)denoms[i];
                    result = nums[i] / denoms[i]; //это будет целочисленное деление в контекста деления с плавающей точкой
                    System.out.println(nums[i] + "/" + denoms[i] + "=" + result  );
                }
                catch (ArithmeticException e) {
                    System.out.println("Попался 0 в делителях");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Делители кончились. Пока");
        }
    }
}
