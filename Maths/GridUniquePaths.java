package Math;

public class GridUniquePaths {

    int findComb(int n, int k){

        int res = 1;

        if( k > n-k){
            k = n-k;
        }

        for(int i=0;i<k;i++){
            res *= (n-i);
            res /= (i+1);
        }

        return res;
    }

    public int uniquePaths(int A, int B) {

        return findComb(A+B-2, A-1);

    }

}
