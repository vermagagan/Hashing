import java.util.HashSet;
public class CountDistinctElements
{
    public static void main(String[] args)
    {
        int arr[] = {2,3,5,6,7,1,3,4,2,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
