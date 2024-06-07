import 'package:flutter/material.dart';
import 'package:navigation_widgets_template/screen/home_screen.dart'; // Import HomePage
import 'package:navigation_widgets_template/screen/second_screen.dart'; // Import SecondPage

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Navigation Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSwatch(primarySwatch: Colors.deepPurple),
      ),
      home: const HomePage(), // Use HomePage
      routes: {
        '/second': (context) => SecondPage(),
      },
    );
  }
}
