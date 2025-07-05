package com.vanshrathod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String input) {
        if(input.isEmpty()) return 0;
        String delimiter = ",|\n|;";

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\n");
            String delimiterPart = input.substring(2, newlineIndex); 
            input = input.substring(newlineIndex + 1);
        
        
            // Support [***] or [;][%]
            if (delimiterPart.startsWith("[") && delimiterPart.endsWith("]")) {
                StringBuilder regexBuilder = new StringBuilder();
                Matcher matcher = Pattern.compile("\\[(.*?)]").matcher(delimiterPart);
                while (matcher.find()) {
                    if (regexBuilder.length() > 0) regexBuilder.append("|");
                    regexBuilder.append(Pattern.quote(matcher.group(1)));
                }
                delimiter = regexBuilder.toString();
            } else {
                delimiter = Pattern.quote(delimiterPart);               // for single custom delimiter
            }
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
