import 'package:flutter/material.dart';

class SecondPage extends StatelessWidget {
  static const routeName = '/second';

  @override
  Widget build(BuildContext context) {
    final String? text = ModalRoute.of(context)?.settings.arguments as String?;

    return Scaffold(
      appBar: AppBar(
        title: const Text('Second Page'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            if (text != null)
              Text(
                'You entered: $text',
                style: const TextStyle(fontSize: 20),
              ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.pop(context);
              },
              child: const Text('Go Back'),
            ),
          ],
        ),
      ),
    );
  }
}
