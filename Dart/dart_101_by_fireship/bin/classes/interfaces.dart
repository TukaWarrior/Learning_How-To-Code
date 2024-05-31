void main() {

  // Whenever you create a class  in datr, you implicitly also create an interface. 
  // An interface determines how a class will look to someone else in the codebase. In other words, it determines what you will see when working with this code in a different file. 
  // By default, instance variables and methods are public. 

  var e = Elephant('Bob');

  // works everywhere
  e.sayHi();

  // only works in this file
  e._saySecret();
}

class Elephant {
  // abstract class Elephant
  // creates only an interface. An class that can not be instantiated. 

  // Public interface
  final String name;

  // in the interface, but visible only in this library. (private)
  final int  _id = 23;

  // Not in the interface, since this is a constructor. 
  Elephant(this.name);

  // Public method.
  sayHi() => 'My name is $name.';

  // Private method.
  _saySecret() => 'My ID is $_id,';
}