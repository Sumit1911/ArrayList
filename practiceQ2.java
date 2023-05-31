import java.util.*;
public class practiceQ2 {
    public ArrayList<Integer> isLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<nums.size()-1; i++) {
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 > nums.get(i+1)) {
                list.add(nums.get(i));
            }
        }
        if(nums.size() == 1) {
            list.add(nums.get(0));
        }
        if(nums.size()>1) {
            if(nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1) ) {
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
        // for(int i = 0; i<list.size(); i++) {
        //     for(int j = i+1; j<list.size(); j++) {
        //         if(list.get(i) == list.get(j)) {
        //             listL.add(list.get(i));
        //         }
        //         else if(list.get(i)+1 == list.get(j) || list.get(i)-1 == list.get(j)) {
        //             listL.add(list.remove(i));
        //         }
        //         else {
        //             listM.add(list.get(i));
        //         }
        //     }
        // }
        // System.out.println(listL);
        
       
    }
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.print(isLonely(nums));
    }
}
