package br.com.booksTI.booksTI.controller;

import br.com.booksTI.booksTI.model.Book;
import br.com.booksTI.booksTI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/allbooks")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping("/createbook")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @DeleteMapping("/deletebook/id/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBooks(id);
    }

}
