package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int wordIndex = word.length - 1;
        for (int i = post.length - 1; i > 0; i--) {
            if (post[i] == word[wordIndex--]) {
                result = true;
            }
        }
        return result;
    }
}
