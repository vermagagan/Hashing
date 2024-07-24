import java.util.HashSet;
public class UnionandIntersection
{
    public static void main(String[] args)
    {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> ex=new HashSet<>();
        for(int i=0; i<arr1.length && i<arr2.length; i++)
        {
            set.add(arr1[i]);
            set.add(arr2[i]);
        }
        System.out.println("Union = "+set);
        set.clear();
        
        for(int i=0; i<arr1.length; i++)
        {
            ex.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++)
        {
            if(ex.contains(arr2[i]))
            {
                set.add(arr2[i]);
                ex.remove(arr2[i]);
            }
        }
        System.out.println("Interserction = "+set);
    }
}
