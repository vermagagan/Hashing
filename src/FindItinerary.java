import java.util.HashMap;
public class FindItinerary
{
    public static String getStart(HashMap<String, String> hm)
    {
        HashMap<String, String> mh=new HashMap<>();
        for (String s : hm.keySet())
        {
            mh.put(hm.get(s), s);
        }
        for(String s : hm.keySet())
        {
            if(!mh.containsKey(s))
                return s;
        }
        return null;
    }
    public static void main(String[] args)
    {
        HashMap<String , String> hm=new HashMap<>();
        hm.put("Chennai", "Bengaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");

        String s=getStart(hm);
        System.out.print(s);
        while(!hm.isEmpty())
        {
            String destination = hm.get(s);
            System.out.print("---------->"+destination);
            hm.remove(s);
            s = destination;
        }
    }
}
