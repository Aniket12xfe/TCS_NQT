package DSA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static int longestSubstring(String str){
        int n = str.length();
        int maxLength = 0;
        int right = 0, left = 0;
        Set<Character> set = new HashSet<>();
        while (right < n){
            if(!set.contains(str.charAt(right))){
                set.add(str.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            }
            else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestSubstring(str));
    }
}
