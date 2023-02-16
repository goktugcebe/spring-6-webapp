package agc.springframework.spring6webapp.services;

import agc.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
