package org.example

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Kotlin")
        FamilyTree.walkFamilyTree(FamilyTree.root)
    }
}