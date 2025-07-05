package com.vanshrathod;

public class StringCalculator {
    public int add(String input) {
        if(input.isEmpty()) return 0;
        String delimiter = ",|\n|;";

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\n");
            delimiter = input.substring(2, newlineIndex); 
            input = input.substring(newlineIndex + 1);
        }
        

        String numbers[] = input.split(delimiter);
        int sum = 0;
        for (String num : numbers) {
            if (num.isEmpty()) continue;    // <- this will handle the edges case of testMixedNewlineCommaEdgeCase() 
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
