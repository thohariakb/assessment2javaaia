package com.thohariakbar.StringReversed;

public class StringReversed {

        public static void main(String[] args) {

            String str = "Thohari Akbar";
            String reversedStr = "";

            for (int i = str.length() - 1; i >= 0; --i) {
                reversedStr += str.charAt(i);
            }

            System.out.println(reversedStr);
        }

}
