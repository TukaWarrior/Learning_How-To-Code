import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme:
            ColorScheme.fromSeed(seedColor: Color.fromARGB(255, 0, 119, 255)),
        useMaterial3: true,
      ),
      home: const MyBlogList(title: 'Mob Programming'),
    );
  }
}

class MyBlogList extends StatefulWidget {
  const MyBlogList({super.key, required this.title});

  final String title;

  @override
  State<MyBlogList> createState() => _MyBlogListState();
}

class _MyBlogListState extends State<MyBlogList> {
  var items = [
    BlogEntry("Unser erster Blog-Eintrag", "24.05.2024", "Hello Class"),
    BlogEntry("Unser zweiter Blog-Eintrag", "24.05.2024", "Hello Class")
  ];

  void _addBlog() {
    setState(() {
      items.add(BlogEntry("titel", "date", "text"));
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      floatingActionButton: OutlinedButton(
        child: Text("Add Blog"),
        onPressed: _addBlog,
      ),
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: ListView.builder(
          itemCount: items.length,
          itemBuilder: (context, index) {
            return BlogCard(blog: items[index]);
          }),
    );
  }
}

class BlogCard extends StatelessWidget {
  const BlogCard({
    super.key,
    required this.blog,
  });

  final BlogEntry blog;

  @override
  Widget build(BuildContext context) {
    return Card(
      child: Padding(
        padding: const EdgeInsets.all(8.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              blog.titel,
              style: const TextStyle(fontWeight: FontWeight.bold, fontSize: 20),
            ),
            const SizedBox(
              height: 8,
            ),
            Text(blog.text),
            const SizedBox(
              height: 8,
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Text(blog.date),
                const Icon(Icons.favorite_outline),
              ],
            ),
          ],
        ),
      ),
    );
  }
}

class BlogEntry {
  String titel;
  String text;
  String date;

  BlogEntry(this.titel, this.date, this.text);
}
