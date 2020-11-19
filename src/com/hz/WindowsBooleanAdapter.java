package com.hz;

import java.util.*;

public class WindowsBooleanAdapter implements BooleanAdapter {

    private ConsoleReader adaptee;

    private List<String> truthyValues;

    public WindowsBooleanAdapter(ConsoleReader reader) {
        this.adaptee = reader;

        String[] trueWords = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        this.truthyValues = Arrays.asList(trueWords);
    }

    @Override
    public Boolean readLineBoolean() {

        String line = this.adaptee.readLine();

        // see if the given answer is in the list
        return truthyValues.contains(line);
    }
}
