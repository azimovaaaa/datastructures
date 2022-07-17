/* @author: <Fatima Azimova>
 * UNI: fa2539
 * @date: <9/25/2020>
 */
import java.util.Arrays;

public class Tester{
    public static final void main(String[] args) {
        
        //create an array of Rectangle objects
        Rectangle[] shapes =  new Rectangle[6];
        shapes[0] = new Rectangle(3.0, 2.1);
        shapes[1] = new Rectangle(2.7, 1.5);
        shapes[2] = new Rectangle(4.1, 2.6);
        shapes[3] = new Rectangle(7.8, 1.1);
        shapes[4] = new Rectangle(6.9, 5.5);
        shapes[5] = new Rectangle(2.7, 4.0);
        
        //create an object of GenericMethods
        GenericMethods x= new GenericMethods();
        //run the linearSearch 
        int q = x.linearSearch(shapes, new Rectangle(7.8, 1.1));
        System.out.println("The item is at index: " +q); 
        //print out the unsorted array
        for(Rectangle r : shapes) {
            System.out.println(r); 
        }
        //sort the array
        Arrays.sort(shapes);       
        System.out.println("_________"); 
        //print out the sorted array
        for(Rectangle r : shapes) {
            System.out.println(r);
        }
        //run the binarySearch
        int b = x.binarySearch(shapes, new Rectangle(3.0, 2.1));
        System.out.println("The item is at index: " +b); 
//         int not = x.binarySearch(shapes, new Rectangle(1.2, 2.1));
//         System.out.println(not); 

       
//         System.out.println(x);
    }
}