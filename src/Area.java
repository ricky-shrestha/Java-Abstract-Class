 class Area extends Shape {
 public double RectangleArea(double length, double breadth) {
   return length * breadth;
 }

 public double SquareArea(double side) {
  return side * side;
 }

 public double CircleArea(double radius) {
  return Math.PI * radius * radius;
 }
}
