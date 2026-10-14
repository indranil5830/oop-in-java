import java.util.Arrays;
import java.util.Collections;

public class SortElement {
    public static void main(String[]args){
        //approach-1
       /*  int a[]={8,70,20,40,100};
        System.out.println("Arrays before sorting:"+Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Arrays after sorting:"+Arrays.toString(a));*/
        //approach-2
       /*  int a[]={9,55,34,2,35,40};
        System.out.println("arrays element before sorting:"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Arrays element after sorting:"+Arrays.toString(a));*/

        //approach-3  (reverse descending order)
        Integer a[]={55,34,76,90,43,200};
        System.out.println("Arrays element before sorting:"+Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Arrays element after sorting:"+Arrays.toString(a));


    }
}
