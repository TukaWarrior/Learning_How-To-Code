void main() {

  // A map is a key value pair, where every key on the left is unique and points to a value on the right side. 
  // key : value
  Map<String, dynamic> book = {
    'title': 'Moby Dick', 
    'author': 'Herman Melville',
    'pages': '752'
  };

  book['title']; // access value at key
  book['published'] = 1851; // assign value to key

  book.keys;
  book.values;
  book.values.toList();

  for (MapEntry b in book.entries) {
    print ('Key ${b.key}, Value ${b.value}');
  }

  book.forEach((key, value) => print('Key: $key, Value: $value'));
}