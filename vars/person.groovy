import org.foot.Person

def crearPerson(String nombre, String apellidos) {
  println(nombre)
  p=new Person(nombre: nombre, apellidos: apellidos)
  println(p.nombre)
  returnValue p 
}

def printName(){
    println('name1')
}

def printSecondName(){
    println('second name')
}