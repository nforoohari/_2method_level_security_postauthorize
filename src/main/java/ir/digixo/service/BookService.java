package ir.digixo.service;

import ir.digixo.entity.Author;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookService {

    private final Map<String, Author> records =
            Map.of("borna", new Author("borna foroohari", List.of("my love city"), List.of("writer", "reader")),
                    "bardia", new Author("bardia foroohari", List.of("my love music"), List.of("researcher"))
            );

    @PostAuthorize("returnObject.roles.contains('reader')")
    public Author getBookDetails(String name) {
        System.out.println("BookService.getBookDetails(name) : " + name);
        return records.get(name);
    }
}
