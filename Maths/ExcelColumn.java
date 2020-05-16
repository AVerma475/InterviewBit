package Math;

public class ExcelColumn {

    public int titleToNumber(String A) {

        int ans = 0;

        for(int i=0;i<A.length();i++){
            ans  = 26*ans;
            ans += A.charAt(i) - 'A' + 1;
        }

        return ans;
    }
}
