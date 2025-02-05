package org.example.stringbuffer;

public class ConcatenateString {

    public static String concatenateStr(String[] arr){
        if(arr.length == 0){
            return null;
        }

        StringBuffer sb = new StringBuffer();
        for(String s: arr){
            sb.append(s).append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strArr = {"This", "is", "a", "StringBuffer", "program"};

        String result = concatenateStr(strArr);
        System.out.println(result);
    }
}
