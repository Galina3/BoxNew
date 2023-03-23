package task1;

public class BoxNew {
    private double length;
    private double width;
    private double height;

    public BoxNew(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

        System.out.println(length * width * height);
    }

    public BoxNew(double length){
       // this.length = length;
      //  System.out.println(length * width * height);
        this(length,2, 3);

    }
    public BoxNew(double width, double height) {
        this (4,width, height);
    }
    public BoxNew() {
        this(7,6);
    }



}
