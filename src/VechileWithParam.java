public class VechileWithParam {
    int passagers;
    int capfuel;
    int mpg;
    VechileWithParam(int p, int f, int m){
        passagers=p;
        capfuel=f;
        mpg=m;
    }
    int range(){
        return this.mpg * this.capfuel;
    }

}
