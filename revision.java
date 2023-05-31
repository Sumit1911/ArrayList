import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

import javax.swing.event.ListSelectionListener;
public class revision {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        idx1 = list.set(idx1, list.get(idx2));
        idx2 = list.set(idx2, temp);
        System.out.println(list);
    }

    public static void main(String args[]) {
        // ArrayList<Character> list1 = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Double> list2 = new ArrayList<>();
        // ArrayList<String> list3 = new ArrayList<>();
        // list3.add("Sumit Kumar");
        // list1.add(100);
        // System.out.println(list3);
        // System.out.println("Enrollement = " + list1);
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++) {
        //    max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);;
        //Collections.sort(list);
        //System.out.println(list);
        //swap(list, 1, 2);

        //2-D ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // list.add(1);
        // list.add(2);
        // mainList.add(list);
        // list1.add(3);
        // list1.add(5);
        // mainList.add(list1);
        // System.out.println(mainList)
        // for(int i = 1; i<=5; i++) {
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // //System.out.print(mainList);

        // for(int i = 0; i<mainList.size(); i++) {
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j = 0; j<currList.size(); j++) {
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // int maxWater = 0;
        // for(int i = 0; i<height.size(); i++) {
        //     for(int j = i+1; j<height.size(); j++) {
        //         int ht = Math.min(height.get(i), height.get(j));
        //         int width = j-i;
        //         int currWater = ht*width;
        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }

        // int lp = 0; 
        // int rp = height.size()-1;
        // int maxWater = 0;
        // while(lp<rp) {
        //     int ht = Math.min(height.get(lp), height.get(rp));
        //     int width = rp-lp;
        //     int currWater = ht*width;
        //     maxWater = Math.max(maxWater, currWater);
        //     if(height.get(lp)<height.get(rp)) {
        //         lp++;
        //     } else {
        //         rp--;
        //     }
        // }
        // System.out.println(maxWater);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        // Collections.sort(list);
        // System.out.println(pairSum(list, 14));
        System.out.println(pair_sum(list, 1));

    }
    public static boolean pair_sum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i)>list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp) {
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            } else if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%n;
            } else {
                rp = (n+rp-1)%n;
            }

        }
        return false;
    }
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        // for(int i = 0; i<list.size(); i++) {
        //     for(int j = i+1; j<list.size(); j++) {
        //         if(list.get(i) + list.get(j) == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp) {
        if(list.get(lp) + list.get(rp) == target) {
            return true;
        } else if(list.get(lp) + list.get(rp) < target) {
            lp++;
        } else {
            rp--;
        }
    }
        return false;
    }
}
