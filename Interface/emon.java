interface Area{
    final static float pi = 3.14F;
    float compute (float x, float y);
}

class Rectangle implements Area{
    public float compute(float x, float y){
        return (x * y);
    }
}

class Circle implements Area{
    public float compute (float x, float y){
        return (pi * x * y);
    }
}

class emon{
    public static void main(String[] args) {
        Rectangle ract = new Rectangle();
        Circle cir = new Circle();
        Area area;
        area = ract;
        System.out.println("Area of Rectangle = " + area.compute(10, 20));
        area = cir;
        System.out.println("Area of Circle = " + area.compute(10, 0));
    }
}