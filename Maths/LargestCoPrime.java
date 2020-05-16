package Math;

public class LargestCoPrime {

    int gcd(int x, int y){
        if(x == 0){
            return y;
        }

        return gcd(y%x, x);
    }

    public int cpFact(int A, int B) {

        while(gcd(A,B) != 1){
            A /= gcd(A,B);
        }
        return A;
    }

}
