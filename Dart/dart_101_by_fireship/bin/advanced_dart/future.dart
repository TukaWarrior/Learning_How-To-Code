// Dart provides support for async programming. It provides a varaity of different functions and datastructures to perform async programming. 
  // Futures and Streams are the most important ones. 

  // A future allows you to perform an operation in the background. 

  // A future is a one time event. 
  // Somethign asynchronous happens then you either handle it successfully or catch an error because something went wrong.

import 'dart:async';

void main(){
  var delay = Future.delayed(Duration(seconds: 5));

delay 
  .then((value) => print('I have been waiting'))
  .catchError((err) => print(err));
  // Depending on the future, only one of those events will be executed. They are mutually exclusive. 


  runInTheFuture();

}

// The async await syntax replaces then and catch to write code in a more syncronous lookign way. 
// Adding the async keyword after a function tells dart to automatically return a Future. 
Future<String> runInTheFuture() async {
  var data = await Future.value('world');
  return 'hello $data';
}