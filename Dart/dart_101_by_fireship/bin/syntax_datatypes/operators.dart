void main() {

  // Basic arithmetic
  10 + 2; // add
  10 - 2; // subtract
  10 * 2; // multiply
  10 / 2; // divide

 // Logic
  1 == 1; // is equal to
  1 < 2; // is smaller than
  1 > 2; // is larger than
  1 <= 2; // is smaller than or equal to
  1 >= 2; // is larger than or equal to

  (1 >= 1) && ('a' == 'b'); // and. booth valuzes must be true.
  (1 >= 1) || ('a' == 'b'); // or. one of the values must be true.


  var x = 1;
  x++; // increment a value by one. x = x+1
  x--; // decrement a value by one. x = x-1


  // Assignment
  String? name;
  name ??= 'Guest'; // Assign value if null, otherwise use current value.
  var z = name ?? 'Guest'; // Does thge same thing but is just an operator.  Doesen't assign the value to a variable.


  // Ternary 
  String color = 'blue';
  var isThsBlue = color == 'blue' ? 'Yep, blue it is' : 'Nah, it aint blue';
  // Ternary because it consists of three parts.
  // condition ? value if true : value if false


  // Cascade
  // Create an object called Paint, and then accessing and modifying multiple properties on that object. 
  dynamic Paint;

  // Example that doesen't use cascade:
  // var paint = Paint();
  // paint.color = 'black';
  // paint.strokeCap = 'round';
  // paint.strikeWidth = 5.0;

  // Example that uses cascade.
  // Cascade allows you to call a method or access a property on an object but it will discard the normal result and return the original object. 
  // call method, but return original object
  var paint = Paint()
    ..color = 'black'
    ..strokeCap = 'round'
    ..strokeWidth = 5.0;
    // Use the cascade operator to call methods on an object without having to create a new line of code. 
    // It can often eliminate the need to create a temporary variable, which is especially useful in with working in Flutter’s widget tree.


  // Typecast
  var number = 23 as String;
  number is String; // true
}