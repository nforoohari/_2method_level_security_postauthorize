package ir.digixo.controller;

import ir.digixo.entity.Author;
import ir.digixo.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/details/{name}")
    public Author getDetails(@PathVariable String name) {
        System.out.println("BookController.getDetails /book/details/{name} : " + name);
        return bookService.getBookDetails(name);
    }
}
