package com.example.demoapp.model;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Comment {
    public Comment(long id, String text) {
        this.text = text;
    }

    public String echo() {
        return text;
    }

    public String repeat(int time) {
        return IntStream.range(0, time).mapToObj(i -> text).collect(Collectors.joining());
    }

    private final String text;
}
