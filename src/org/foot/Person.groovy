package org.foot

class Person{
    String nombre
    String apellidos

    void imprimirNombreRojo(){
        echo "\033[31m${nombre}\033[0m"
    }
}