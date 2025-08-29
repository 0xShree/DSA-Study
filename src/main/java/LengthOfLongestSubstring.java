public class LengthOfLongestSubstring {
    public int solution(String s){
        int left = 0;
        int maxLength = 0;
        int[] ascii = new int[128];

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            // Move left pointer if character found
            left = Math.max(ascii[c], left);
            // Get max length between right and left
            maxLength = Math.max(maxLength, right - left + 1);
            // Add character current position
            ascii[c] = right + 1;
        }

        return maxLength;
    }
}
