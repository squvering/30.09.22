public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = 0;
        }
        for(int i=0; i < str1.length(); i++) {
            arr[(int)str1.charAt(i) - (int)'a']++;
        }
        for(int i=0; i < str2.length(); i++) {
            arr[(int)str2.charAt(i) - (int)'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i] < 0)
                return false;
        }
        return true;
    }
}
