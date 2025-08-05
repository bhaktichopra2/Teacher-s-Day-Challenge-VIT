import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0) return new ArrayList<>();

       Map<String, List<String>> map = new HashMap<>();

       for( String s : strs){
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
       }
       return new ArrayList<>(map.values());
    }


    public static void printGroupedAnagrams(List<List<String>> groups) {
        for (List<String> group : groups) {
            System.out.println(group);
        }
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> grouped = groupAnagrams(input);

        System.out.println("Grouped Anagrams:");
        printGroupedAnagrams(grouped);
    }
}
