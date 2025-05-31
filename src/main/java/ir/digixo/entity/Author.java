package ir.digixo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Author {
    private String name;
    private List<String> books;
    private List<String> roles;
}
