void main() {

// List inherets from Iterable. 
// An Iterable is an collection of objects. 
// The most common Iterables in dart are List, Map, Set.

// In an List, every item has an index. 

List<int> list = [1, 2, 3, 4, 5]; // Literal List. Create list using literal syntax

list [0]; //access item in list at index[]
list.sublist(2, 3); // Creates a new list with only the items between thsoe two indexes. 

var list2 = List.filled(50, 'Hello'); // Creates list with as many items as defined and a static value at each index. 

list2.length; // get the size of list.
list2.first; // get the last item.
list2.last; // get the first item. 

list.add(4); //push new item to the end of the list
list.removeLast(); //pop
list.insert(1, 1000); // insert item at index.

// loop over each item in the list.
for (int n in list) {
  print(n);
}

// Also loop over every item in the list and call a callback function for each iteration. 
list.forEach((n) => print(n));

// Takes the original list and runs a callback on each item to transform the value into a new list.
// E.g this doubles all the numbers in the list. 
var doubled = list.map((n) => n*2);
doubled.forEach(print);

// combine lists. Concatenate list
var combined = [...list, ...doubled];


// You can use conditional logic in literal syntax. 
  bool depressed = false;
  var cart = ['milk', 
  'eggs',
  if (depressed) 'Vodka'
  ];
}