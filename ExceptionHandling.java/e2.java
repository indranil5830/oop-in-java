

public class e2 {
    public static void main(String[]args){
        System.out.println("hello indra");
        int a[]=new int[4];
        try{
            System.out.println(a[8]);

        }
        catch(Exception e){
            System.out.println("array index"+e.getMessage());
        }
    }
    
}
