package com.vanshrathod;

public class StringCalculator {
    public int add(String input) {
        if(input.isEmpty()) return 0;
        String numbers[] = input.split(",");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
