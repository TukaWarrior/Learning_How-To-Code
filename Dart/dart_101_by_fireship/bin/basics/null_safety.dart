void main(){

// Null-safety means that a variable cannot be assigned a null value by default. 
  // int age = null; //error;

  // To make a variable nullable, add a question mark behind of the type.
  //When using ?, the variable gets automatically assigned to null;
  int? age;

  print(age == null); // true
  print('Hello');

  // eliminates need for null checks.
  if (age != null){
    // do something.
  }

  // Assertion operator ! make the compiler think the calue is non-null.
  String? answer;
  // String result = answer; //error A nullable variable can not be assigned to a non nullable variable.

  String result = answer!;
  // The ! assertion operator behind of a variable tells the compiler that you are sure the value is not null. 
  // This increases the risk of runtime error. Be absolutely positive that the vbariable doesen't has a null value. 


}

// late initialization.
// A variable gets initialized but doesen't get defined until later in the code, like in a method or constructor. 
// The variable can be made nullable ?, but this is kind of a hack if the variable actually doesen't need a null value. 
// The late keyword allows you to keep the property as a non-nullable value but initialize it later.
class Animal{
  // final String _size; //error
  late final String _size;

  void goBig() {
  _size = 'big';
  print(_size);
  }
}
// Like the assertion ! operator, use late only when absolutely necessary, because it could result in additional runtime errors. 