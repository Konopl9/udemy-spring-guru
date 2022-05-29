package com.mishcma.spring5webapp.bootstrap;

import com.mishcma.spring5webapp.domain.Author;
import com.mishcma.spring5webapp.domain.Book;
import com.mishcma.spring5webapp.repositories.AuthorRepository;
import com.mishcma.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book aaa = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(aaa);
        aaa.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(aaa);

        Author rod = new Author("Rod", "Johnson");
        Book noEFB = new Book("J2EE Development without EJB", "321321321");
        rod.getBooks().add(noEFB);
        noEFB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEFB);

        System.out.println("Started in Bootstrap");
        System.out.println("Numbers of Books: " + bookRepository.count());

    }
}
