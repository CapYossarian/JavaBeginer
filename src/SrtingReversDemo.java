class StringRevers{
    private String s;
    private String strout = new String();
    StringRevers(String st){
        s= new String(st);
    }
    int getLenght(){
      return s.length();
    }
    String Revers(int i){
        if (i>0) strout=s.charAt(i)+Revers(i-1);
        else strout=strout+s.charAt(i);
        return strout;
    }
}
public class SrtingReversDemo {
    public static void main(String[] args) {
        StringRevers s = new StringRevers("abcdefg");
        System.out.println(s.Revers(s.getLenght()-1));
    }
}
