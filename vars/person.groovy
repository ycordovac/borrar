import org.foot.Person

def crearPerson(String nombre, String apellidos) {
  return new Person(nombre: nombre, apellidos: apellidos)
}

def printName(){
    println('name')
}

def printSecondName(){
    println('second name')
}