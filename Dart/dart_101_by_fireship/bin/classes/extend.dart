void main() {
  // Dart supports inheritance, which allows you to take one class and extend it's funcionality to a new class. 
}


abstract class Dog {

  void walk() {
    print('walking');
  }
}

// Extend class pug with dog. Pug can now access walk() from dog. 
class Pug extends Dog {
  String breed = 'pug';

  // Inhereted methods can be overwritte. They can implement completely new behaviour or add something new to them. 
  // Here, a new print() is added. 
  @override
  void wakl() {
    super.walk();
    print('I am tired. Stopping now.');
  }
}