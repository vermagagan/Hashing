import java.util.HashMap;
public class MajorityElements
{
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        int arr[] = {1,3};
        for(int i=0; i<arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (int i : map.keySet())
        {
            if(map.get(i) > arr.length/3)
                System.out.println(i);
        }

    }
}
