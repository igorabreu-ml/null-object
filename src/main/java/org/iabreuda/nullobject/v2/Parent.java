package org.iabreuda.nullobject.v2;

import java.util.List;

public interface Parent {

    List<Parent> getChildren();

    String getName();

    Integer getGeneration();

    void print();
}
