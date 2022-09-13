package org.iabreuda.nullobject.v3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
public class Person {

    private String Name;

    private List<Person> children;

    private Integer generation;

    public Optional<List<Person>> getChildren() {
        return Optional.ofNullable(children);
    }

    public void print() {
        System.out.println("Name: " + getName() + ", Generation: " + getGeneration());
    }
}
