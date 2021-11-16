package com.hz;

import java.util.Objects;

public class BooAdapter implements BooInterface{

    private ConsoleReader adaptedReader;
    private String[] acceptable = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

    public BooAdapter(ConsoleReader reader){
        adaptedReader = reader;
    }

    @Override
    public Boolean checkBoolean() {
        String answear = adaptedReader.readLine();
        Boolean correct = false;
        for (String s : acceptable) {
            if (Objects.equals(s, answear)) {
                correct = true;
            }
        }
        return correct;
    }

}
