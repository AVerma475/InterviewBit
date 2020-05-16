package Math;

import java.util.ArrayList;

public class AllFactors {

    public ArrayList<Integer> allFactors(int A) {

        ArrayList<Integer> ans = new ArrayList<>();
        int checkN = (int)Math.sqrt(A);


        int count = 0;
        for(int i = 1; i<= checkN; i++){
            if(A%i == 0){
                ans.add(count, i);
                if(A/i != i){
                    ans.add(ans.size()-count, A/i);
                }
                count++;
            }
        }

        return ans;
    }
}
