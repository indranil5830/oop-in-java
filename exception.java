public class exception   {
    public static void main(String[]args){
    
      try
    {
        int a=20;
        int b=0;
        int c=a/b;
        
        System.out.println(c);
    
    }
    catch(ArithmeticException e){
    
        System.out.println("Error:divided by zero"+e.getMessage());
    }
    
    finally{
        System.out.println("finally block is executed");

    }
}
}

