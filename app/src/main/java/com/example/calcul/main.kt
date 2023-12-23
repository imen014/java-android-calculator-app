package com.example.calcul

import android.R
import android.widget.EditText
import java.util.Scanner


fun main() {
    val editText: EditText = findViewById(R.id.num1)
    val scanner = Scanner(System.`in`)

    print("Entrez la première variable : ")
    val variable1 = scanner.nextInt()

    print("Entrez la deuxième variable : ")
    val variable2 = scanner.nextInt()

    val somme = variable1 + variable2

    println("La somme des deux variables est : $somme")
}
