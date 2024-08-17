package StringDSAPractice;

import com.sun.jdi.request.StepRequest;

import java.util.Arrays;

public class subString {

    public static String[] findSubSequence(String str) {
        if (str.length() == 0) {
            String ans[] = {""};
            return ans;
        }
        String smallAns[] = findSubSequence(str.substring(1));

        String ans[] = new String[2 * smallAns.length];

        int k = 0;

        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns   [i];
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }

        return ans;
    }


    int countSubstringOfS(String[] s) {
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            int a = Integer.parseInt(s[i]);
            if (a > 47) {
                count++;
            }
        }
        return count;
    }


    boolean concatAndCheck(String str, String a, String b) {
        if (str.equals(a + b) || str.equals(b + a))
            return true;
        return false;
    }


    static int longestUncommonSubsequence(String[] str1, String[] str2) {

        String s1 = Arrays.toString(str1);
        String s2 = Arrays.toString(str2);

        if (s1.equals(s2))
            return 0;

        int count = 0;

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] != str2[j]) {
                    if (str1[i].length() > count) {
                        count = str1[i].length();
                    }
                }
            }
        }

        return count;
    }




    static boolean sameSubSequence(String[] str) {

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]))
                    return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        String str = "aab";
        String str2 = "ab";

        String[] s1 = findSubSequence(str);
        String[] s2 = findSubSequence(str2);

        System.out.println(longestUncommonSubsequence(s1,s2));


    }

}
