package me.krios2146.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int printableWords = words.length;

        if (brokenLetters.isEmpty()) {
            return printableWords;
        }

        Pattern pattern = Pattern.compile("[" + brokenLetters + "]");
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                printableWords--;
            }
        }

        return printableWords;
    }
}
