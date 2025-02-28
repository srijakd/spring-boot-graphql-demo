package com.example.graphQL;

import java.util.Arrays;
import java.util.List;

record Author(int id, String name) {

    private static List<Author> authors = Arrays.asList(
            new Author(1, "Subash Nepal"),
            new Author(2, "Anuradha Koirala"),
            new Author(3, "Prakash Subedi"),
            new Author(4, "Nayan Raj Pandey"),
            new Author(5, "Manjushree Thapa"),
            new Author(6, "Krishna Dharabasi"),
            new Author(7, "Paro Thapa"),
            new Author(8, "Santosh Kumar Koirala"),
            new Author(9, "Aarati Baral"),
            new Author(10, "Suman Pokhrel")
    );

    public static Author getById(int id) {
        return authors.stream().filter(author -> author.id() == id).findFirst().orElse(null);
    }
}
