package DSA.String;

public class CompressString {
    public static void main(String[] args) {

        StringBuilder ans = new StringBuilder();
        String name = "aabcccccaah";
        int count = 1;

        char[] array = name.toCharArray();

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                ans.append(array[i - 1]).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        ans.append(array[array.length - 1]).append(count);

        System.out.println(ans.toString());
    }
}
