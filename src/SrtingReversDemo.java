class StringRevers{
    private String s;
    private String strout;// Считается излишним -->  = new String();
    StringRevers(String st){
        s= st; // redundant --> new String(st);
    }
    int getLenght(){
      return s.length();
    }
    String Revers(int i){
        if (i>0) strout=s.charAt(i)+Revers(i-1);
        else return String.valueOf(s.charAt(i));
        return strout;
    }
}
public class SrtingReversDemo {
    public static void main(String[] args) {
        System.out.println("abcdefg");
        StringRevers s = new StringRevers("abcdefg");
        System.out.println(s.Revers(s.getLenght()-1));
    }
}
