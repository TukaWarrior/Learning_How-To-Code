void main(){

  // everything in dart is an object
  
  int num1 = 1;
  double num2 = 2.0;
  bool isTrue = true;

// "is" is the instance-of operator.
  print((num1 + num2) is int);

// print runtimetype of an object
  print((num1+num2).runtimeType);

  String str = 'Hello';

  // String interpolation.
  print('The type of $str is a String? ${str is String}');

  // reassignable variables.
  var username = 'lucab';
  username = 'lucab2';

  // final means the value can't be changed.
  final String fullname = 'Luca';
  // fullname = 'luca2'; // error


  // const is like final, but is an immutable compile-time constant.
  const int age = 26;
  // const int favNumber = num1 + 5; //error

  // A variable that is static can be defined as const. If the number of an variable gets created at runtime, it can't. Use const whenever possible. 
}