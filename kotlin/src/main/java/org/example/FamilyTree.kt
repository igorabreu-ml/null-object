package org.example

class FamilyTree {
    companion object {
        var root = Person(
                "GeorgeIV",
                listOf(
                        Person(
                                "Elizabeth",
                                listOf(
                                        Person(
                                                "Charles",
                                                listOf(
                                                        Person(
                                                                "Harry",
                                                                listOf(
                                                                        Person("Archie", null, 4)),
                                                                3),
                                                        Person(
                                                                "William",
                                                                listOf(
                                                                        Person("George", null, 4),
                                                                        Person("Charlotte", null, 4),
                                                                        Person("Louis", null, 4)),
                                                                3)),
                                                2),
                                        Person("Anne", null, 2),
                                        Person("Andrew", null, 2),
                                        Person("Edward", null, 2)),
                                1),
                        Person("Margaret", null, 1)),
                0
        )

        fun walkFamilyTree(person: Person) {
            person.print()
            person.children?.forEach { child: Person -> walkFamilyTree(child) }
        }
    }
}