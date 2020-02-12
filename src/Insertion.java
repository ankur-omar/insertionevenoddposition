import java.util.*;
class Insertion{
    public static void main(String[] args)
    {
        int a[] = new int[]{3,5,7,8,9,4,1,2};
        int temp;
        for(int i=1;i<a.length;i++)
        {
            temp =a[i];
            int j=i-1;
            while(j>=0 &&a[j]>temp)
            {
                a[j+1] =a[j];
                j--;
            }
            a[j+1]= temp;


        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }

    }



}
