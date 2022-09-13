package org.iabreuda.nullobject.v4;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.iabreuda.nullobject.v4.optional.Option;

import java.util.List;

@Data
@AllArgsConstructor
public class Person {

    private String Name;

    private List<Person> children;

    private Integer generation;

    public Option<List<Person>> getChildren() {
        return Option.ofNullable(children);
    }

    public void print() {
        System.out.println("Name: " + getName() + ", Generation: " + getGeneration());
    }
}
