package com.example.graphql.springbootgraphqlexample.service.datafetcher;


import com.example.graphql.springbootgraphqlexample.model.Book;
import com.example.graphql.springbootgraphqlexample.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookDataFetcher implements DataFetcher<Book> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
        String isn = dataFetchingEnvironment.getArgument("id");
        System.out.println("ISN: " + isn);
        return bookRepository.getOne(isn);
    }
}
