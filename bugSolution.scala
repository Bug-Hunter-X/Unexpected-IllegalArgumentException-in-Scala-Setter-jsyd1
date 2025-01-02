```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge > 0) _age = newAge
    else throw new IllegalArgumentException(s"Invalid age: $newAge. Age must be positive for $name")
  }
}

val myObject = new MyClass("John")
try{
  myObject.age = 30
  println(myObject.age) //Output: 30
  myObject.age = -5 // throws IllegalArgumentException with more context
}catch{
  case e:IllegalArgumentException => println(e.getMessage())
}
```