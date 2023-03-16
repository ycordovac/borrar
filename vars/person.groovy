import org.foot.Person

def crearPerson(String nombre, String apellidos) {
  println('entre al metodo de la clase person.groovy')
  def returnValue = new Person(nombre: nombre, apellidos: apellidos)
  return returnValue
}

def printName(){
    println('name')
}

def printSecondName(){
    println('second name')
}