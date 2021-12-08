package com.example.demoapp.model;

import com.example.demoapp.DemoappApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {
    @Test
    void echo() {
        Comment comment = new Comment(1, "Hello");
        String result = comment.echo();
        Assertions.assertEquals("Hello", result);
    }

    @Test
    void repeat() {
        Comment comment = new Comment(2, "ヘイ");
        Assertions.assertEquals("ヘイヘイヘイ", comment.repeat(3));
    }
}