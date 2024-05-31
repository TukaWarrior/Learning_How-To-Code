import 'package:flutter/material.dart';

// https://docs.flutter.dev/ui/widgets/layout
void main() {
  runApp(LayoutDemoApp());
}

class LayoutDemoApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Layout Widgets Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: LayoutWidgetsScreen(),
    );
  }
}

class LayoutWidgetsScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Layout Widgets Demo'),
      ),
      body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(8.0),
          child: Column(
            children: <Widget>[
              // Single-child Widgets

              // Align
              // A widget that aligns its child within itself and optionally sizes itself based on the child's size.
              // https://api.flutter.dev/flutter/widgets/Align-class.html
              LayoutSection(
                title: 'Align',
                child: const Align(
                  alignment: Alignment.bottomRight,
                  child: Icon(Icons.flutter_dash, size: 50, color: Colors.blue),
                ),
              ),

              // AspectRatio
              // A widget that attempts to size the child to a specific aspect ratio.
              // https://api.flutter.dev/flutter/widgets/AspectRatio-class.html
              LayoutSection(
                title: 'AspectRatio',
                child: AspectRatio(
                  aspectRatio: 16 / 9,
                  child: Container(
                    color: Colors.green,
                  ),
                ),
              ),

              // Baseline
              // Container that positions its child according to the child's baseline.
              // https://api.flutter.dev/flutter/widgets/Baseline-class.html
              LayoutSection(
                title: 'Baseline',
                child: const Baseline(
                  baseline: 100.0,
                  baselineType: TextBaseline.alphabetic,
                  child: Text(
                    'Baseline Text',
                    style: TextStyle(fontSize: 20.0),
                  ),
                ),
              ),

              // Center
              // Alignment block that centers its child within itself.
              // https://api.flutter.dev/flutter/widgets/Center-class.html
              LayoutSection(
                title: 'Center',
                child: Center(
                  child: Container(
                    color: Colors.blue,
                    height: 50,
                    width: 50,
                    child: const Center(child: Text('Center')),
                  ),
                ),
              ),

              // ConstrainedBox
              // A widget that imposes additional constraints on its child.
              // https://api.flutter.dev/flutter/widgets/ConstrainedBox-class.html
              // LayoutSection(
              // title: 'ConstrainedBox',
              // child: ConstrainedBox(),
              // ),

              // Container
              // A convenience widget that combines common painting, positioning, and sizing widgets.
              // https://api.flutter.dev/flutter/widgets/Container-class.html
              LayoutSection(
                title: 'Center',
                child: Center(
                  child: Image.network(
                    'https://play-lh.googleusercontent.com/i7n5e85brViF4lOCmZkCoF1a3olbksyI0LARrzrLB41b00n8ucvLrwJlU57FbGwxzVOa',
                  ),
                ),
              ),

              // CustomSingleChildLayout
              // A widget that defers the layout of its single child to a delegate.
              // https://api.flutter.dev/flutter/widgets/CustomSingleChildLayout-class.html
              // LayoutSection(
              //   title: 'CustomSingleChildLayout',
              //   child: CustomSingleChildLayout(
              //     child: Image.network(
              //       'https://play-lh.googleusercontent.com/i7n5e85brViF4lOCmZkCoF1a3olbksyI0LARrzrLB41b00n8ucvLrwJlU57FbGwxzVOa',
              //     ),
              //   ),
              // ),

              // Row
              // Layout a list of child widgets in the horizontal direction.
              // https://api.flutter.dev/flutter/widgets/Row-class.html
              LayoutSection(
                title: 'Row',
                child: const Row(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: <Widget>[
                    Icon(Icons.flutter_dash, size: 50, color: Colors.red),
                    Icon(Icons.flutter_dash, size: 50, color: Colors.green),
                    Icon(Icons.star, size: 50, color: Colors.blue),
                  ],
                ),
              ),

              // Column
              // Layout a list of child widgets in the vertical direction.
              // https://api.flutter.dev/flutter/widgets/Column-class.html
              LayoutSection(
                title: 'Column',
                child: const Column(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: <Widget>[
                    Icon(Icons.star, size: 50, color: Colors.red),
                    Icon(Icons.star, size: 50, color: Colors.green),
                    Icon(Icons.star, size: 50, color: Colors.blue),
                  ],
                ),
              ),

              // Stack
              // This class is useful if you want to overlap several children in a simple way, for example having some text and an image, overlaid with a gradient and a button attached to the bottom.
              // https://api.flutter.dev/flutter/widgets/Stack-class.html
              LayoutSection(
                title: 'Stack',
                child: Stack(
                  alignment: Alignment.center,
                  children: <Widget>[
                    Container(
                      height: 100,
                      width: 100,
                      color: Colors.blue,
                    ),
                    Container(
                      height: 60,
                      width: 60,
                      color: Colors.red,
                    ),
                    Container(
                      height: 30,
                      width: 30,
                      color: Colors.green,
                    ),
                  ],
                ),
              ),

              // Expanded
              // A widget that expands a child of a Row, Column, or Flex.
              // https://api.flutter.dev/flutter/widgets/Expanded-class.html
              LayoutSection(
                title: 'Expanded',
                child: Row(
                  children: <Widget>[
                    Expanded(
                      child: Container(
                        color: Colors.red,
                        height: 100,
                        child: const Center(child: Text('Expanded 1')),
                      ),
                    ),
                    Expanded(
                      child: Container(
                        color: Colors.green,
                        height: 50,
                        child: const Center(child: Text('Expanded 2')),
                      ),
                    ),
                  ],
                ),
              ),

              LayoutSection(
                title: 'Flexible',
                child: Row(
                  children: <Widget>[
                    Flexible(
                      child: Container(
                        color: Colors.red,
                        height: 50,
                        child: const Center(child: Text('Flexible 1')),
                      ),
                    ),
                    Flexible(
                      child: Container(
                        color: Colors.green,
                        height: 50,
                        child: const Center(child: Text('Flexible 2')),
                      ),
                    ),
                  ],
                ),
              ),

              // Padding
              // A widget that insets its child by the given padding.
              // https://api.flutter.dev/flutter/widgets/Padding-class.html
              LayoutSection(
                title: 'Padding',
                child: Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: Container(
                    color: Colors.blue,
                    height: 50,
                    child: const Center(child: Text('Padding')),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

class LayoutSection extends StatelessWidget {
  final String title;
  final Widget child;

  LayoutSection({required this.title, required this.child});

  @override
  Widget build(BuildContext context) {
    return Card(
      margin: EdgeInsets.symmetric(vertical: 8),
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            Text(
              title,
              style: const TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 10),
            child,
          ],
        ),
      ),
    );
  }
}
