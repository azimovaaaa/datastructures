/* @author: <Fatima Azimova>
 * UNI: fa2539
 * @date: <9/25/2020>
 */
public class BigO implements BigOInterface{

    //bigO (1)
    public void constant(int n){
        //Create an array of int and set the first to 13
        int[] anArray = new int [n];
        anArray[0]= 13;
    }
    
    //bigO (n^3)
    //nester for loops
    public void cubic(int n){
         int[] anArray= new int [n];
         for (int i=0; i< anArray.length; i++){
             for (int j=0; j<anArray.length; j++){
                 for (int k=0; k<j; k++){
                     if (anArray[k]< anArray[k+1]){
                          int temp = anArray[k];
                          anArray[k] = anArray[k+1];
                          anArray[k+1] = temp;
                     }
                     
                 }
             }
         }
    }
    
    public void exp(int n){
        ex(n);
    }
    //bigO (2^n)
	public int ex(int n){ 
        if(n == 0||n==1){
            return 1;
        }
        return ex(n-1)+ ex(n-2);      
    }
}