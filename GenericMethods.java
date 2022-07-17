/* @author: <Fatima Azimova>
 * UNI: fa2539
 * @date: <9/25/2020>
 */

public class GenericMethods implements GenericMethodsInterface{
    
    public <AnyType extends Comparable<AnyType>> int linearSearch(AnyType[] a, AnyType x){    
       
        for (int i = 0; i < a.length; i++){

                int number = a[i].compareTo(x);
                if (number==0){
                    return i;
                }
        }
        return -1;
     }
    
    public <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] a, AnyType x){
        
        int low = 0;
        int high = a.length - 1;
        return binarySearch(a, x, low, high);        
    }
        
    private <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] a, AnyType x, int low, int high){

            int mid = (low + high) / 2; 
            if (low > high){
                return -1;
            }
            if (a[mid].compareTo(x) < 0) {
                return binarySearch(a, x, mid + 1, a.length);
            }
            else if (a[mid].compareTo(x) > 0) {
                return binarySearch(a, x, 0, mid-1);
            }
            else if(a[mid].compareTo(x) == 0){
                return mid;}
            else{ 
                return -1;}
            
    }
    
}

