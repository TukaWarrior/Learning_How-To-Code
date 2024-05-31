// Dart provides support for async programming. It provides a varaity of different functions and datastructures to perform async programming. 
  // Futures and Streams are the most important ones. 

  // A future allows you to perform an operation in the background. 
  // A stream allows many ascnc events.

import 'dart:async';

void main() {

  // A Stream provides a way to handle multiple async events. Simulate a stream of events by creating one from a list of numbers.
  var stream = Stream.fromIterable([1, 2, 3]);

// By default, a Stream can only have one listener. If you intend to have multiple listeners convert it to a broadcast stream.
var stream2 = Stream.fromIterable([1, 2, 3]).asBroadcastStream();


  stream
  .map((event) => event * 2)
  .listen((event) => print (event));
  // Listen to a stream using.listen. A Stream also supports many functions of a List, like map.



}

streamFun() async {
  var stream = Stream.fromIterable([4, 5, 6]);

  await for (int value in stream) {
    print(value);
  }
}