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
                  alignment: Alignment.bottomLeft,
                  // alignment: Alignment(0.0, 0.0),
                  // alignment: FractionalOffset(0.2, 0.0),
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
                  baseline: 80.0,
                  baselineType: TextBaseline.alphabetic,
                  child: Icon(Icons.flutter_dash, size: 50, color: Colors.blue),
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
              LayoutSection(
                title: 'ConstrainedBox',
                child: ConstrainedBox(
                  constraints: const BoxConstraints.expand(),
                  child: const Card(child: Text('Hello World!')),
                ),
              ),

              // Container
              // A convenience widget that combines common painting, positioning, and sizing widgets.
              // https://api.flutter.dev/flutter/widgets/Container-class.html
              LayoutSection(
                title: 'Container',
                child: Container(
                  child: const Icon(Icons.flutter_dash, size: 50, color: Colors.blue),
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

              // Expanded
              // A widget that expands a child of a Row, Column, or Flex.
              // https://api.flutter.dev/flutter/widgets/Expanded-class.html

              // FittedBox
              // Scales and positions its child within itself according to fit.
              // https://api.flutter.dev/flutter/widgets/FittedBox-class.html
              LayoutSection(
                title: 'FittedBox',
                child: const FittedBox(
                  fit: BoxFit.fill,
                  child: Placeholder(),
                ),
              ),

              // FractionallySizedBox
              // A widget that sizes its child to a fraction of the total available space.
              // https://api.flutter.dev/flutter/widgets/FractionallySizedBox-class.html

              // IntrinsicHeight
              // A widget that sizes its child to the child's intrinsic height.
              // https://api.flutter.dev/flutter/widgets/IntrinsicHeight-class.html

              // IntrinsicWidth
              // A widget that sizes its child to the child's intrinsic width.
              // https://api.flutter.dev/flutter/widgets/IntrinsicWidth-class.html

              // LimitedBox
              // A box that limits its size only when it's unconstrained.
              // https://api.flutter.dev/flutter/widgets/LimitedBox-class.html

              // Offstage
              // A widget that lays the child out as if it was in the tree, but without painting anything, without making the child available for hit testing, and without taking any room in the parent.
              // https://api.flutter.dev/flutter/widgets/Offstage-class.html

              // OverflowBox
              // A widget that imposes different constraints on its child than it gets from its parent, possibly allowing the child to overflow the parent.
              // https://api.flutter.dev/flutter/widgets/OverflowBox-class.html

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
                    child: const Text('Padding'),
                  ),
                ),
              ),

              // SizedBox
              // A box with a specified size. If given a child, this widget forces it to have a specific width and/or height.
              // https://api.flutter.dev/flutter/widgets/SizedBox-class.html

              // SizedOverflowBox
              // A widget that is a specific size but passes its original constraints through to its child, which will probably overflow.
              // https://api.flutter.dev/flutter/widgets/SizedOverflowBox-class.html

              // Transform
              // A widget that applies a transformation before painting its child.
              // https://api.flutter.dev/flutter/widgets/Transform-class.html

// Multi-child layout widgets

              // Column
              // Layout a list of child widgets in the vertical direction.
              // https://api.flutter.dev/flutter/widgets/Column-class.html
              LayoutSection(
                title: 'Column',
                child: const Column(
                  mainAxisAlignment: MainAxisAlignment.spaceAround,
                  children: <Widget>[
                    Icon(Icons.flutter_dash, size: 50, color: Colors.red),
                    Icon(Icons.flutter_dash, size: 50, color: Colors.green),
                    Icon(Icons.flutter_dash, size: 50, color: Colors.blue),
                  ],
                ),
              ),

              // CustomMultiChildLayout
              // A widget that uses a delegate to size and position multiple children.
              // https://api.flutter.dev/flutter/widgets/CustomMultiChildLayout-class.html
              LayoutSection(
                title: 'CustomMultiChildLayout',
                child: Stack(
                  children: <Widget>[
                    Container(
                      width: 200,
                      height: 200,
                      color: Colors.red,
                    ),
                    Positioned(
                      left: 50,
                      top: 50,
                      child: Container(
                        width: 100,
                        height: 100,
                        color: Colors.green,
                      ),
                    ),
                    Positioned(
                      right: 10,
                      bottom: 10,
                      child: Container(
                        width: 50,
                        height: 50,
                        color: Colors.blue,
                      ),
                    ),
                  ],
                ),
              ),

              // Flow
              // A widget that implements the flow layout algorithm.
              // https://api.flutter.dev/flutter/widgets/Flow-class.html

              // GridView
              // A grid list consists of a repeated pattern of cells arrayed in a vertical and horizontal layout. The GridView widget implements this component.
              // https://api.flutter.dev/flutter/widgets/GridView-class.html

              // IndexedStack
              // A Stack that shows a single child from a list of children.
              // https://api.flutter.dev/flutter/widgets/IndexedStack-class.html

              // LayoutBuilder
              // Builds a widget tree that can depend on the parent widget's size.
              // https://api.flutter.dev/flutter/widgets/LayoutBuilder-class.html

              // ListBody
              // A widget that arranges its children sequentially along a given axis, forcing them to the dimension of the parent in the other axis.
              // https://api.flutter.dev/flutter/widgets/ListBody-class.html

              // ListView
              // A scrollable, linear list of widgets. ListView is the most commonly used scrolling widget. It displays its children one after another in the scroll direction.
              // https://api.flutter.dev/flutter/widgets/ListView-class.html

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

              // Table
              // Displays child widgets in rows and columns.
              // https://api.flutter.dev/flutter/widgets/Table-class.html

              // Wrap
              // A widget that displays its children in multiple horizontal or vertical runs.
              // https://api.flutter.dev/flutter/widgets/Wrap-class.html

// Sliver widgets

              // CupertinoSliverNavigationBar
              // An iOS-styled navigation bar with iOS-11-style large titles using slivers.
              // https://api.flutter.dev/flutter/cupertino/CupertinoSliverNavigationBar-class.html

              // CustomScrollView
              // A ScrollView that creates custom scroll effects using slivers.
              // https://api.flutter.dev/flutter/widgets/CustomScrollView-class.html

              // SliverAppBar
              // A material design app bar that integrates with a CustomScrollView.
              // https://api.flutter.dev/flutter/material/SliverAppBar-class.html

              // SliverChildBuilderDelegate
              // A delegate that supplies children for slivers using a builder callback.
              // https://api.flutter.dev/flutter/widgets/SliverChildBuilderDelegate-class.html

              // SliverChildListDelegate
              // A delegate that supplies children for slivers using an explicit list.
              // https://api.flutter.dev/flutter/widgets/SliverChildListDelegate-class.html

              // SliverFixedExtentList
              // A sliver that places multiple box children with the same main axis extent in a linear array.
              // https://api.flutter.dev/flutter/widgets/SliverFixedExtentList-class.html

              // SliverGrid
              // A sliver that places multiple box children in a two dimensional arrangement.
              // https://api.flutter.dev/flutter/widgets/SliverGrid-class.html

              // SliverList
              // A sliver that places multiple box children in a linear array along the main axis.
              // https://api.flutter.dev/flutter/widgets/SliverList-class.html

              // SliverPadding
              // A sliver that applies padding on each side of another sliver.
              // https://api.flutter.dev/flutter/widgets/SliverPadding-class.html

              // SliverPersistentHeader
              // A sliver whose size varies when the sliver is scrolled to the edge of the viewport opposite the sliver's GrowthDirection.
              // https://api.flutter.dev/flutter/widgets/SliverPersistentHeader-class.html

              // SliverToBoxAdapter
              // A sliver that contains a single box widget.
              // https://api.flutter.dev/flutter/widgets/SliverToBoxAdapter-class.html

              //
              //
              //

              //
              //
              //

              //
              //
              //

              //
              //
              //

              //
              //
              //

              //
              //
              //

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
  // static const double sectionHeight = 200.0; // Fixed height for all sections

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
              style: const TextStyle(
                fontSize: 20,
                fontWeight: FontWeight.bold,
              ),
            ),
            const SizedBox(
              height: 100,
              width: 400,
            ),
            child,
          ],
        ),
      ),
    );
  }
}
