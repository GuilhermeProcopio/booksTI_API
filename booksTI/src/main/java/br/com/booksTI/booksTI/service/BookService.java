package br.com.booksTI.booksTI.service;

import br.com.booksTI.booksTI.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    List<Book> bookList = new ArrayList<>();

    public Book createBook(Book book){
        bookList.add(book);
        return bookList.get(0);
    }

    public List<Book> findAllBooks(){
        return bookList;
    }

    public void deleteBooks(Long id){
        bookList.remove(id);
    }




}
