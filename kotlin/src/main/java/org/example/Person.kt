package org.example

class Person(val name: String, val children: List<Person>?, val generation: Int?) {

    fun print() {
        println("Name: $name, Generation: $generation")
    }
}