package org.iabreuda.nullobject.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Person {

    private String Name;

    private List<Person> children;

    private Integer generation;

    public void print() {
        System.out.println("Name: " + getName() + ", Generation: " + getGeneration());
    }
}
