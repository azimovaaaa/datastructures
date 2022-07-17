/* @author: <Fatima Azimova>
 * UNI: fa2539
 * @date: <9/25/2020>
 */

public class Rectangle implements RectangleInterface, Comparable<Rectangle> { 
    //instance variables 
    private double length; 
    private double width;
    
    //constructor 
    public Rectangle (double l, double w){
        length= l;
        width= w;
    }
    
    //compareTo method
    public int compareTo(Rectangle other) {
        double perimeter1=2*(length+width);
        double perimeter2=2*(other.length+other.width);
        if (perimeter1== perimeter2){
            return 0;
        }
        else if (perimeter1> perimeter2){
            return 1;
        }
        else{
            return -1;
        }
    }
    //Return width
    public double getWidth() {
        return width;
    }

    //Return height 
    public double getLength() {
        return length;
    }
    
    public String toString(){
        String n= Double. toString(length);
        String s= Double. toString(width);
        return "the length is " + n + " and the width is "+s;
    }
  
}
