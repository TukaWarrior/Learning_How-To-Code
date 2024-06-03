import 'package:flutter/material.dart';

class AlignWidgetPage extends StatelessWidget {
  const AlignWidgetPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Align Widget'),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () {
            Navigator.pop(context);
          },
        ),
      ),
      body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: <Widget>[
              // Description Text
              const Text(
                'The Align widget positions its child according to the given alignment. '
                'In this example, the icon is aligned to the bottom-left corner of the container.',
                style: TextStyle(fontSize: 16),
              ),
              const SizedBox(height: 16),

              // Image
              Image.network(
                'https://flutter.dev/images/catalog-widget-placeholder.png',
                height: 200,
                fit: BoxFit.cover,
              ),
              const SizedBox(height: 16),

              // Align Widget Example
              Container(
                height: 120.0,
                width: 120.0,
                color: Colors.blue[50],
                child: const Align(
                  alignment: Alignment.bottomLeft,
                  child: Icon(Icons.flutter_dash, size: 50, color: Colors.blue),
                ),
              ),
              const SizedBox(height: 16),

              // Descriptive Box Cards
              Card(
                margin: const EdgeInsets.symmetric(vertical: 8),
                elevation: 4,
                child: Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: Text(
                    'This is a descriptive box using Card widget. You can add more information here.',
                    style: const TextStyle(fontSize: 16),
                  ),
                ),
              ),
              Card(
                margin: const EdgeInsets.symmetric(vertical: 8),
                elevation: 4,
                child: Padding(
                  padding: const EdgeInsets.all(16.0),
                  child: Text(
                    'You can add more descriptive boxes with Card widgets. They provide a nice styling and elevation effect.',
                    style: const TextStyle(fontSize: 16),
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
