import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class PairSum {
    //brute force-O(n^2)
    public static boolean pairSum(ArrayList<Integer> val, int target) {
        for(int i = 0; i<val.size(); i++) {
            for(int j = i+1; j<val.size(); j++) {

                if(val.get(i) + val.get(j) == target) {
                    //System.out.println(i + "," + j);
                    return true;
                    
                }
            }
        }
        return false;
    }
    //Optimized - O(n)
    public static boolean pair_sum(ArrayList<Integer> val, int target) {
        int lp = 0;
        int rp = val.size()-1;
        while(lp<rp) {
            if(val.get(lp) + val.get(rp) == target) {
                return true;
            } else if(val.get(lp) + val.get(rp) < target){
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> val = new ArrayList<>();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);
        val.add(5);
        // System.out.println(pairSum(val, 5));
        System.out.println(pair_sum(val, 5));

    }
}
