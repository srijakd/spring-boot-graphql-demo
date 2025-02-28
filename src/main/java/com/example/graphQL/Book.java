package com.example.graphQL;

import java.util.Arrays;
import java.util.List;

record Book(int id, String name, int pageCount, int authorId) {

    private static List<Book> books = Arrays.asList(
            new Book(1, "Laxmi Prashna", 210, 1),
            new Book(2, "The Silent Voice", 330, 2),
            new Book(3, "Sahakarmi", 210, 3),
            new Book(4, "The Last Transit", 285, 4),
            new Book(5, "Forget Me Not", 300, 5),
            new Book(6, "Palpasa Café", 350, 6),
            new Book(7, "Jhola", 400, 7),
            new Book(8, "Nani", 250, 8),
            new Book(9, "Saath-Saath", 180, 9),
            new Book(10, "Chha Maya Chha", 310, 10)
    );

    public static Book getById(int id) {
        return books.stream().filter(book -> book.id() == id).findFirst().orElse(null);
    }
}
