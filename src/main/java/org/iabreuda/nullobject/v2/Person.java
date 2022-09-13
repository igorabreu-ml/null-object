package org.iabreuda.nullobject.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.iabreuda.nullobject.v2.optional.Option;

import java.util.List;

@Data
@AllArgsConstructor
public class Person implements Parent {

    private String Name;

    private List<Parent> children;

    private Integer generation;

    @Override
    public List<Parent> getChildren() {
        return children;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Generation: " + getGeneration());
    }
}
