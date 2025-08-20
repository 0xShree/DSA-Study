public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2){
        if(s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        // Get the frequencies of s1
        for(int i = 0; i < s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length(); i++){
            // Get the frequencies of s2
            freq2[s2.charAt(i) - 'a']++;

            // Remove the last character if window size is more the length of s1
            if(i >= s1.length()){
                freq2[s2.charAt(i - s1.length()) - 'a']--;
            }
            // Check for whether frequencies matches
            if(matches(freq1, freq2)){
                return true;
            }
        }

        return false;
    }

    public static boolean matches(int[] freq1, int[] freq2){
        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}
