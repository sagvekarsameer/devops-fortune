package org.example;

import java.util.Random;

public class FortuneTeller {
    private static final String[] quotes = {
            "Keep calm and automate all the things.",
            "Your container will not crash today.",
            "Git commit -m 'fixed everything'",
            "CI/CD: Code. Ignore. Commit. Deploy.",
            "You will write flawless YAML on the first try.",
            "Don’t blame Jenkins, blame the pipeline 😄"
    };

    public static void main(String[] args) {
        System.out.println(getRandomQuote());
    }

    public static String getRandomQuote() {
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
}

