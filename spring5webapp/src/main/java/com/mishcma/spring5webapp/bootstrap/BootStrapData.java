package com.mishcma.spring5webapp.bootstrap;

import com.mishcma.spring5webapp.domain.Author;
import com.mishcma.spring5webapp.domain.Book;
import com.mishcma.spring5webapp.domain.Publisher;
import com.mishcma.spring5webapp.repositories.AuthorRepository;
import com.mishcma.spring5webapp.repositories.BookRepository;
import com.mishcma.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Assignment 2
        Publisher publisher = new Publisher("Books publisher", "Street 100", "Kiev", "Ukraine", "02212");

        publisherRepository.save(publisher);

        System.out.println("Number of Publishers: " + publisherRepository.count());


        Author eric = new Author("Eric", "Evans");
        Book aaa = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(aaa);
        aaa.getAuthors().add(eric);
        aaa.setPublisher(publisher);

        authorRepository.save(eric);
        bookRepository.save(aaa);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEFB = new Book("J2EE Development without EJB", "321321321");
        rod.getBooks().add(noEFB);
        noEFB.getAuthors().add(rod);
        noEFB.setPublisher(publisher);

        authorRepository.save(rod);
        bookRepository.save(noEFB);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Numbers of Books: " + bookRepository.count());

    }
}
