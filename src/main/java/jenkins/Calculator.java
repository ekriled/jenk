package jenkins;

public class Calculator {
	

    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    public static int subtractNumbers(int a, int b) {
        return a - b;
    }
    
    public static void main(String args[])  
    {     
    System.out.println("main method invoked" +  addNumbers(6, 5));  
   
    }  

}