import java.util.ArrayList;
public class basics {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        //Add element
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
       // System.out.println(list);

        
        //get element ...
        //System.out.println(list.get(1));
        //remove element
        // System.out.println(list.remove(2));
        // System.out.println(list);
        //set element at index
        //System.out.println(list.set(2, 5));
        //System.out.println(list);

        //size of arrayList
        // System.out.println(list.size());
        // for(int i = 0; i<list.size(); i++) {
        //     System.out.println(list.get(i) + " ");
        // }

        //print reverse
        // for(int i = list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }

        //find maximum
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list.size(); i++)  {
            // if(max<list.get(i)) {
            //     max = list.get(i);
            // }
            // or
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element = " + max);
    }
}