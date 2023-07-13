
package exceptionhandl2;

public class Exceptionhandl2 {

    
    public static void main(String[] args) {
        try{
       int array[]=new int[5];
       array[5]=5;
            System.out.println("value of:"+array[5]);
        }
        catch(Exception e){
            System.out.println("the array out of bound try to add value out of array");
        }
    }
    
}
