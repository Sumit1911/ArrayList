// import java.util.*;
// public class important_point_gfg {
//     public static void main(String args[]) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Sumit");
//         list.add("Kumar");
//         list.add("Gupta");
//         //System.out.println("initial" + list);
//         list.add(1, "Kumar"); // add Method
//         //System.out.println("after add" + list);
//         list.remove(1);
//         //System.out.println("after remove " + list);
//         //foreach loop
//         for(String s : list) {
//             System.out.print(s + " ");
//         }
//     }
// }
import javax.swing.*;  
public class important_point_gfg {
    public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("ok");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  
