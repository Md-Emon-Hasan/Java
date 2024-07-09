class Rectangle{
    int height;
    int width;
    Rectangle(int a, int b){
        height = a;
        width = b;
    }
    int square(){
        return (height * width);
    }
}

class RectangleArea{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 15);
        int area = rect1.square();
        System.out.println("Total Area: " + area);
    }
}
