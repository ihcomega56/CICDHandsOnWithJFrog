package com.example.demoapp;

import com.example.demoapp.model.Comment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoappApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);

		Comment comment = new Comment(1, "やっほー");
		System.out.println(comment.echo());
		System.out.println(comment.repeat(2));
	}

}
