package com.asim.synergychapter3

val alphabet = ('A'..'Z').map { it.toString()}.toMutableList()

enum class Words(val char: String, val words: ArrayList<String>){
    A(char = "A", arrayListOf("Air", "Ant")),
    B(char = "B", arrayListOf("Busted", "Bird")),
    C(char = "C", arrayListOf("Cat", "Cake")),
    D(char = "D", arrayListOf("Dog", "Duck")),
    E(char = "E", arrayListOf("Elephant", "Eagle")),
    F(char = "F", arrayListOf("Fish", "Fox")),
    G(char = "G", arrayListOf("Goat", "Giraffe")),
    H(char = "H", arrayListOf("Horse", "Hippo")),
    I(char = "I", arrayListOf("Ice", "Island")),
    J(char = "J", arrayListOf("Jam", "Jellyfish")),
    K(char = "K", arrayListOf("Kangaroo", "Koala")),
    L(char = "L", arrayListOf("Lion", "Lemon")),
    M(char = "M", arrayListOf("Monkey", "Mango")),
    N(char = "N", arrayListOf("Nest", "Noodle")),
    O(char = "O", arrayListOf("Octopus", "Orange")),
    P(char = "P", arrayListOf("Penguin", "Pizza")),
    Q(char = "Q", arrayListOf("Queen", "Quilt")),
    R(char = "R", arrayListOf("Rabbit", "Rainbow")),
    S(char = "S", arrayListOf("Snake", "Sun")),
    T(char = "T", arrayListOf("Tiger", "Tree")),
    U(char = "U", arrayListOf("Umbrella", "Unicorn")),
    V(char = "V", arrayListOf("Van", "Violin")),
    W(char = "W", arrayListOf("Whale", "Watermelon")),
    X(char = "X", arrayListOf("Xylophone", "X-ray")),
    Y(char = "Y", arrayListOf("Yak", "Yogurt")),
    Z(char = "Z", arrayListOf("Zebra", "Zoo"))
}
