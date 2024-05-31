// We can use the public code from another file by importing the filename. 
import 'dart:math';

import '../classes/constructors.dart' as my_shapes;

// Define a namespace with "as" for the library that we are importing to avoid name colisions. 
// If we also define a Circle in this file, dart will prefere the class from this file, instead of the imported one. 
// That is why we have to sue namespaces. 

// If the file is in the same directory:
// import 'constructors.dart';

import '../classes/constructors.dart' hide Point;
// Use the hide keyword followed by the name of the class, to import the file but hide an specific class. 

import '../classes/constructors.dart' show Rectangle;
// A better way would be to import just a specific class of the file, using the show keyword followed by the class name. 

class Circle {}

void main() {
  // We now have access to the circle class from constructors.dart. 
  // Accessing it using the namespace due to naming colision.
  my_shapes.Circle(radius: 23); 
  // Circle(radius: 23); // error because dart defaults to the Circle defined in this file. 

  Rectangle(1, 2);
}