package agc.springframework.spring6webapp.services;

import agc.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
