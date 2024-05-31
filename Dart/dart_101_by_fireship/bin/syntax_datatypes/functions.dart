void main() {

  // Functions are objects. 
  // They can be assigned to variables and passed as arguments or return values from other functions. 
  // This makes it popssibvle to implement functional programming paterns. 


  // Basic function
  takeFive(){} // define
  takeFive(); // call
  // if undefined, return type is null.

  String takeFour() { // define return type
    return '';  // return statement
  }
  takeThree() { // Return type can be removed because it will automatically infer that type based on the return value. 
    return '';
  }
  var str = takeThree();


  String takeTwo(int number) { // pass arguments into the function by defining parameters. Type name
    return '$number minus two equals ${number -2}';
  }

  takeTwo(44); // positional argument. Will alaway be required.

  // Common to use named parameters because they make the code more readable. 
  // Defined named parameter by putting braces {} around them in the function.  
  // namedParams({int a, int b}) {} // Makes passing an argument to the function optional, but dart will complain about that because it doesen't allow a null value. 

  // You can work arount that by adding a ? to the type to make it nullable. 
  // Or you can add the required keyword to make that argument required when it is called. 
  namedParams2({ required int a, int b = 5}) {}
  // Or set a default value by using = that will be used unless a different value is passed when the function ios called. 

  // To call the function, reference the arguments by name
  namedParams2(a: 44, b:2); // In that case, a is required 
  namedParams2(a: 44); // but b can be left out. 
  namedParams2(b: 2, a: 44); // The order is irrelevant.
  // Named parameters are required for flutter widgets. 


  // Arrow Function
  takeTen(int number) => '$number minus ten equals ${number - 10}';
  takeTen(44);
  // Allows the function to be written on one line. 


  // Anonymous Function
  callIt(
    () => 'Hello World!'
  );
  // Instead of naming the function, use parenthesis () with an arrow to keep the code nice and concise. 
  // Naming the function doesen't always make sense. 
}

  // First-class functions
  callIt(Function callback) {
    var result = callback();
    return 'Result: $result';
  }

// A Function that takes another function as an argument and then calls that function inside it's own body. 
// This is known as a callback function and used in many different dart APIs. 

