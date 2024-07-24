import java.util.HashMap;
public class largestsubarraysum0
{
    public static void main(String[] args)
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        int arr[] = {15,-2,2,-8,1,7,10,23};
        int sum=0, len=0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(map.containsKey(sum))
                len = Math.max(len, i-map.get(sum));
            
            else
                map.put(arr[i], i);
        }

        System.out.println("Length of largest subarray with zero sum is: "+len);
    }
}