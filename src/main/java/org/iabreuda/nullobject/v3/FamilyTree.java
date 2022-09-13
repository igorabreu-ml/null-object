package org.iabreuda.nullobject.v3;

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
                                        new Person("Archie", null,4)),
                                    3),
                                new Person(
                                    "William",
                                    List.of(
                                        new Person("George", null,4),
                                        new Person("Charlotte", null,4),
                                        new Person("Louis", null,4)),
                                    3)),
                            2),
                        new Person("Anne", null,2),
                        new Person("Andrew", null,2),
                        new Person("Edward", null, 2)),
                    1),
                new Person("Margaret", null, 1)),
            0
    );

    public static void walkFamilyTree(Person person) {
        person.print();
        person.getChildren().ifPresent(children -> children.forEach(FamilyTree::walkFamilyTree));
    }

}
