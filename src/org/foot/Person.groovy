package org.foot

class Person{
    String nombre
    String apellidos

    void imprimirNombreRojo(){
        println("\033[31m${nombre}\033[0m") 
    }
}