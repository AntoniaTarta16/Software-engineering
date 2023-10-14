public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        String entity="";
        int ok = 0;
        if (shape instanceof GoodSquare) {
            entity="Square";
            int side=((GoodSquare)shape).getSide();
            if(shape.getArea() == side * side){
                ok = 1;
            }
        }
        else if (shape instanceof GoodRectangle){
            entity="Rectangle";
            int height = ((GoodRectangle) shape).getHeight();
            int width = ((GoodRectangle) shape).getWidth();
            if (shape.getArea() == height * width) {
                ok = 1;
            }
        }
        if (ok == 1){
            System.out.println("Great " + entity + " you got there!");
        }
        else {
            System.out.println("Well, not a " + entity + ".");
        }
    }

}
