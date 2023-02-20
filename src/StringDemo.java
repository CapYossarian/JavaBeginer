public class StringDemo {
    public static void main(String[] args) {
        //Различные способы объявления
        String str1 = new String("Строка созданная конструктором");
        String str2 = "String содержит эту строку";
        String str3 = new String(str2);
        String str4 = new String();
        str4 = str2;
        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("str3=" + str3);
        System.out.println("Вывод str4 " + str4);
        if (str2.equals(str3)) System.out.println("str2 эквивалентна str1");
        if (str4 == str2) {
            System.out.println("str4 и str2 ссылаются на одно и тоже место в памяти");
            if (str4.equals(str2)) {
                System.out.println("И эквивалентны");
            }

        }
    }
}
