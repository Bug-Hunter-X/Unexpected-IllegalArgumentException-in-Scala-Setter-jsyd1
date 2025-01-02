```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge > 0) _age = newAge
    else throw new IllegalArgumentException("Age must be positive")
  }
}

val myObject = new MyClass("John")
myObject.age = 30
println(myObject.age) //Output: 30

myObject.age = -5 // throws IllegalArgumentException
```