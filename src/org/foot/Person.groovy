package org.foo

class  Persona {
    private String nombre
    private AString appelidos

    void imprimirNombreRojo(){
        echo "\033[31m${nombre}\033[0m"
    }
}