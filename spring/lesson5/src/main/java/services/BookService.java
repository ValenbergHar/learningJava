package services;

import DTO.CreateBookRequest;
import domain.BookDAO;
import domain.DataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private DataBase dataBase;

    public void createBook(CreateBookRequest createBookRequest) {
        BookDAO bookDAO = new BookDAO(createBookRequest.getName(), createBookRequest.getAuthor());
        dataBase.putBook(bookDAO);
    }

    public int getNumberOfBooks(){
        return dataBase.getNumberOfBooks();
    }
}
