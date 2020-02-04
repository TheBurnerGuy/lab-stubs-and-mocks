package util;

public class StringProcessor {

    public String capitalizeName(String name) {
        String[] words = name.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word.toUpperCase()).append(word, 1, word.length());
        }

        return sb.toString();
    }
}
