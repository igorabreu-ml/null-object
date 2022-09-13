package org.iabreuda.nullobject.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
public class NullPerson implements Parent {

    private String Name;

    private List<Parent> children;

    private Integer generation;

    @Override
    public List<Parent> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public void print() {
    }
}
