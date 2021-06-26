// Interfaces/Task3.kt
package interfacesExercise3

import atomictest.eq

interface Pet {
    val sound: String
}

class Dog : Pet {
    override val sound: String = "Bark!"
}

class Cat : Pet {
    override val sound: String = "Meow!"
}

class Hamster : Pet {
    override val sound: String = "Squeak!"
}

fun main() {
    val pets = listOf(Dog(), Cat(), Hamster())
    pets.map { it.sound } eq "[Bark!, Meow!, Squeak!]"
}