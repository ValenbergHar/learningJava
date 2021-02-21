package controllers;

import DTO.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import services.BookService;

@RestController()
public class BookController {

    @Autowired
    private BookService bookService;

    @PutMapping("/books/create")
    ResponseEntity putBooks(@RequestBody CreateBookRequest createBookRequest) {
        bookService.createBook(createBookRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/books/numbers")
    public ResponseEntity getNumberOfBooks() {
        int numberOfBooks = bookService.getNumberOfBooks();
        return new ResponseEntity(numberOfBooks, HttpStatus.OK);
    }
}