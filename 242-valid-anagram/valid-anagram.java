class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        if(s.length() == t.length()){
            for(char ch : s.toCharArray()){
                freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
            }
            for(char ch : t.toCharArray()){
                freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
            }
            return freq1.equals(freq2);
        }
        return false;
    }
}