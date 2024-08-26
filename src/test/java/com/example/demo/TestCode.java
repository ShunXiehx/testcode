package com.example.demo;

import org.junit.jupiter.api.Test;

public class TestCode {

    @org.junit.jupiter.api.Test
    public void testStringCheck() {
        String input = "aabcccbbad";
        boolean check = true;
        while (check) {
            check = false;
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (i+2 < input.length() && input.charAt(i) == input.charAt(i+1) && input.charAt(i+1) == input.charAt(i+2)) {
                    i += 2;
                    check = true;
                } else {
                    s.append(input.charAt(i));
                }
            }
            input = s.toString();
            System.out.println(input.toString());
        }
    }

    @Test
    public void testStringCheck2() {
        String input = "aabcccbbad";
        boolean check = true;
        while (check) {
            StringBuilder newString = new StringBuilder();
            int count = 1;
            for (int i = 0; i < input.length(); i++) {
                if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                    count++;
                } else {
                    if (count >= 3) {
                        char replacementChar = (char) (input.charAt(i) - 1);
                        newString.append(replacementChar);
                    } else {
                        for (int j = 0; j < count; j++) {
                            newString.append(input.charAt(i));
                        }
                    }
                    count = 1;
                }
            }
            String result = newString.toString();
            if (result.equals(input)) {
                break;
            } else {
                input = result;
            }
            System.out.println(newString.toString());
        }
        System.out.println(input);
    }
}
