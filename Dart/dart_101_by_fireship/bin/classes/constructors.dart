void main() {

  var  rect = Rectangle(25, 30); 

  const cir = Circle(radius: 50, name: 'foo'); // Use named arguments instead of positional arguments. 

  var p1 = Point.fromMap({'lat':23, 'lng' :50});
  var p2 = Point.fromList([23, 50]);
}

class Rectangle {
  final int width;
  final int height;
  late final int area; // late because it is not calculated until the width and height variable are defined. 
  String? name; // Nullable value if argument is optional. 

  Rectangle(this.width, this.height, [this.name]) { //[] are optional arguments. 
    area = width * height;
  }
}


class Circle {
  const Circle({required int radius, String?name});
  // required if the argument is required to conbstruct the object. 
  // if it is a non nullable value, it is either required or be set with a default value. 
  // If it is optional and nullable, add the ? to the type. 
  // It is recommended to use the const keyword if you can. 
}

// Named constructors
// A class might want multiple ways to construct an object. 
class Point {
  double lat = 0;
  double lng = 0;

  // Takes a map as input.
  Point.fromMap(Map data) {
    lat = data['lat'];
    lng = data['lng'];
  }

  // Takes List as input.
  Point.fromList(List data) {
    lat = data[0];
    lng = data[1];
  }
}