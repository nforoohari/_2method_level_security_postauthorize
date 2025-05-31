package ir.digixo.service;

import ir.digixo.entity.Author;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {

    private Map<String, Author> records =
                Map.of("mahsa", new Author("mahsa norozi", List.of("bar hasti"), List.of("admin", "reader")),
                    "ashkan", new Author("ashkan rad", List.of("My Tehran"), List.of("researcher"))
            );

    @PostAuthorize("returnObject.roles.contains('reader')")
   // @PostAuthorize("returnObject.name == authentication.name")
    public Author getBookDetails(String name) {
        System.out.println(name);
        return records.get(name);
    }
}
