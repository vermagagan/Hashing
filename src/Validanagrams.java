import java.util.HashMap;
public class Validanagrams
{
    public static Boolean isAnagram(String S, String T)
    {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<S.length(); i++)
        {
            char ch=S.charAt(i);
            map.put(ch,map.getOrDefault(map, 0)+1);
        }
        for(int i=0; i<T.length(); i++)
        {
            char ch=T.charAt(i);
            if(map.containsKey(ch))
            {
                if(map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch,map.getOrDefault(ch, map.get(ch))-1);
            }
            else
            {
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args)
    {
        String S="RACED";
        String T="CARED";
        System.out.println(isAnagram(S,T));
    }
}
