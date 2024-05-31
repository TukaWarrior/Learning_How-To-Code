void main() {

  // A class is a blueprint for an object. Every object is an instance of a class.

  // Create a new object with type Basic
  // Basic thing = new Basic(); 
  Basic thing = Basic(5); // New keyword is not required. 

  thing.id; // Instcance member
  thing.doStuff(); // Method that runs on an instance. 

  Basic.helper(); // Static method that runs globally, not on an instance. It is called on the class, not the instance. 
}

class Basic {
  int id;

  Basic(this.id); // Constructor. A function that runs once, when the object is ccreated. 

  doStuff() {
    print('Helly my ID is $id');
  }

  static helper() {
    print('Helping...');
  }
}