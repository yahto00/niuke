package day03;

/**
 * Created by yahto on 20/06/2017.
 */
public class ReverseSentenceSolution {
    public static String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        if (length == 1 || length == 0) {
            return str;
        }
        int index = chars.length - 1;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
            index--;
        }
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 32) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = flag; j < i; j++) {
                    stringBuffer.append(chars[j]);
                }
                sb.append(ReverseWord(stringBuffer.toString()));
                flag = i + 1;
                sb.append(' ');
            }
            if (i == chars.length - 1) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = flag; j <= i; j++) {
                    stringBuffer.append(chars[j]);
                }
                sb.append(ReverseWord(stringBuffer.toString()));
            }
        }
        return sb.toString();
    }

    private static char[] ReverseWord(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        if (length == 0 || length == 1) {
            return chars;
        }
        int index = chars.length - 1;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
            index--;
        }
        return chars;
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("I am a student."));
    }
}
