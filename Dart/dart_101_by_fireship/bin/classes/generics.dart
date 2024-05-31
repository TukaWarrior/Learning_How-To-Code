void main () {
  // A generic is basically a way to pass a type as a parameter. 
  // A List is like a box or container that can hold many different things. 
  // A generic type provides a way to strongly type the things inside that container. 

  

  // Generics are a way to parameterize types. 
  //They allow a class to wrap a type, and then use that type in multiple places. 
  //For example, we can have a Box class that wraps an double or String type.

  List <int> number = [1, 2, 3];

  Box<String> box1 = Box('cool');

  Box<double> box2 = Box(2.23);

  Box<List<int>> box3 = Box([1, 2, 3]);


}

class Box<T> {
  // <T> represents a variable type that can be anything passed in by the end user when instantiating the class. 

  T value;

  Box(this.value);

  T openBox() {
    return value;
  }
}