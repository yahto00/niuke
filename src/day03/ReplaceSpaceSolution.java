package day03;

/**
 * Created by yahto on 20/06/2017.
 */
public class ReplaceSpaceSolution {
    public static String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 32) {
                spaceCount++;
            }
        }
        char[] newChars = new char[chars.length + spaceCount * 2];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 32) {
                newChars[index] = chars[i];
                index++;
                continue;
            }
            newChars[index++] = 37;
            newChars[index++] = 50;
            newChars[index++] = 48;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < newChars.length; i++) {
            stringBuffer.append(newChars[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args){
        System.out.println(replaceSpace(new StringBuffer("hello world")));
    }
}
