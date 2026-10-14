public class swappingTwoNumber{
    public static void main(String[]args){
        int a=10;
        int b=20;
        System.out.println("before swapping values are.."+a+" "+b);
        //using third variable logic 1
       /*  int t=a;
        a=b;
        b=t;*/
        // logic2
         /*  a=a+b;
          b=a-b;
          a=a-b;*/
          //logic 3
          a=a*b;
          b=a/b;
          a=a/b;
        System.out.println("after swapping values are..."+a+" "+b);


    }
}


