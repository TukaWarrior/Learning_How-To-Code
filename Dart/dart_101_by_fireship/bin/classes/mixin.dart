void main () {
  // Extending a class may not be enough if you want to add additional behaviour beyond the original extention. 
  // A mixin is just like a class, it can have methods and properties, but it can’t be instantiated.
  var s = SuperHuman();
  s.benchpress();
  s.sprint();

}


class Human {}


class SuperHuman extends Human with String, Fast {}


mixin String {
  bool doesLift = true;  

  void benchpress() {
    print('doing bench press...');
  }
}


mixin Fast {
  bool doesRun = true;

  void sprint() {
    print('running fast...');
  }
}