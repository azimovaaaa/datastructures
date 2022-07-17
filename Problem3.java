/* @author: <Fatima Azimova>
 * UNI: fa2539
 * @date: <9/25/2020>
 */

public class Problem3{
    public static final void main(String[] args) {
        
        BigO test = new BigO();

        long startTime = System.nanoTime();
        test.constant(1000);
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
       
        startTime = System.nanoTime();
        test.cubic(200);
        endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        
        startTime = System.nanoTime();
        test.exp(50);
        endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }
}