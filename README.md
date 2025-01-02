# Unexpected IllegalArgumentException in Scala Setter

This repository demonstrates a potential source of unexpected `IllegalArgumentException` in Scala. The issue arises in a setter method that handles input validation, but the exception's origin might not be immediately obvious.  The example showcases a `MyClass` with an `age` property which enforces positive values.

## Running the code

You'll need to have Scala installed on your system to run this code.  Simply run `bug.scala` using the Scala compiler and interpreter.

## Bug Details

The bug lies in the `age_=` setter method.  If the user attempts to set a negative value for age, it will throw `IllegalArgumentException`, which might require more descriptive error handling.

## Solution

The `bugSolution.scala` file illustrates how this error can be mitigated by providing more context in the exception message or using a more sophisticated error-handling strategy. 