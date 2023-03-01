public class VarArgs {
    //Глава 6 Переменное количество аргументов
    // +Объявлен статический метод в том же классе
    static  void TestVarArgs(int ... v){
        for (int i=0;i<v.length;i++){
            System.out.print(v[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Четыре параметра ");
        TestVarArgs(1,2,3,4);
        System.out.println();
        System.out.print("Без параметров ");
        TestVarArgs();
        System.out.println();
    }
}
