void main() {
  String color = 'blue';

  if (color == 'blue') {
    // do something if
  } else if (color == 'yellow') {
    // do something if
  } else {
    // default
  }


  if (color == 'blue') print('Hello blue');

  // check if the String is empty.
  String thing1 ='';

  if (thing1.isEmpty); // returns bool of true or false.

  // check if the variable is assigned null.
  String? thing2;
  if (thing2 != null);




  // Loops
  for (var i = 0; i < 5; i++) {
    print(i);
    break; // prematurely ends the loop.
    // continue; // skips this iteration of the loop and go to the next one. 
  }

  int i = 0;
  while (i < 5) {
    print (i);
    i++;
  }

  i = 0;
  do {
    print(i);
    i++;
  } while (i < 5);

  // Assert
  var txt = 'good';
  assert(txt != 'bad');
  // if condition is true, nothing happens. if condition is false, it raises an error. 
  // Assert only raise errors in debug mode. In producton mode, the errors are ignored. 
  // It is a way to validate the shape of the data before you start operating on it further in the code.
}