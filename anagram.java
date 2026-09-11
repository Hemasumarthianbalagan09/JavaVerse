public class anagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println("The given strings are anagrams: " + anagrammethod(s, t));
    }
        static boolean anagrammethod(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            int[] count = new int[256];
            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            for(int i : count){
                if(i != 0){
                    return false;
                }
            }
            return true;



    }
    
}
