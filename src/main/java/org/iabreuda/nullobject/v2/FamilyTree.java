package org.iabreuda.nullobject.v2;

import java.util.List;

public class FamilyTree {

    public static final Person root = new Person(
            "GeorgeIV",
            List.of(
                new Person(
                    "Elizabeth",
                    List.of(
                        new Person(
                            "Charles",
                            List.of(
                                new Person(
                                    "Harry",
                                    List.of(
                                        new Person("Archie", List.of(new NullPerson()),4)),
                                    3),
                                new Person(
                                    "William",
                                    List.of(
                                        new Person("George", List.of(new NullPerson()),4),
                                        new Person("Charlotte", List.of(new NullPerson()),4),
                                        new Person("Louis", List.of(new NullPerson()),4)),
                                    3)),
                            2),
                        new Person("Anne", List.of(new NullPerson()),2),
                        new Person("Andrew", List.of(new NullPerson()),2),
                        new Person("Edward", List.of(new NullPerson()), 2)),
                    1),
                new Person("Margaret", List.of(new NullPerson()), 1)),
            0
    );

    public static void walkFamilyTree(Parent parent) {
        parent.print();
        parent.getChildren().forEach(FamilyTree::walkFamilyTree);
    }

}
