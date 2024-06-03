import 'package:flutter/material.dart';
import 'package:layout_widgets_3/layout_widgets/align_widget.dart';

class WidgetCategoryPage extends StatelessWidget {
  final String title;

  const WidgetCategoryPage({super.key, required this.title});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(title),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () {
            Navigator.pop(context);
          },
        ),
      ),
      body: ListView(
        children: <Widget>[
          ListTile(
            title: const Text('Align'),
            onTap: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => const AlignWidgetPage()),
              );
            },
          ),
          // Add more widgets as needed
        ],
      ),
    );
  }
}