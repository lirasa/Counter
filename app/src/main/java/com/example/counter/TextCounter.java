package com.example.counter;

public class TextCounter {
    public static int getCharsCount(String phrase){

        if (phrase != null) {
            return phrase.length();
        }
        return 0;
    }

    public static int getWordsCount(String phrase){
        if (phrase != null) {
            String trimmedPhrase = phrase.trim();
            if (trimmedPhrase.isEmpty()) {
                return 0;
            } else {
                String[] words = trimmedPhrase.split("[^\\p{L}\\p{Nd}']+");
                int wordCount = 0;
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }
                return wordCount;
            }
        }
        return 0;
    }
}
