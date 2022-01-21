public class TestLine2D
{
    public static void main(String[] args)
    {
        //Change this to Point
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);

        Line2D One = new Line2D(p1,p2);
        Line2D Two = new Line2D(p3,p4);
        Line2D Coords4 = new Line2D(4,9,6,8);

        //Testing constructor using 2 Point objects and the toString method 
        //Line 1: [(0,0), (3,4)] Line 2: [(4,9), (6,8)]

        System.out.println(One);
        System.out.println(Two);

        //Testing constructor using 4 int's and the toString method 
        //Line 3: [(4,9), (6,8)]
        System.out.println(Coords4);


        //Testing getP1 and getP2 methods: 
        //Line 1, getP1: x=0,y=0
        //Line 1, getP2: x=3,y=4 
        //Line 2, getP1: x=4,y=9 
        //Line 2, getP2: x=6,y=8
        System.out.println("getP1: " + One.getP1());
        System.out.println("getP2: " + One.getP2());
        System.out.println("getP1: " + Two.getP1());
        System.out.println("getP2: " + Two.getP2());

        //Testing getSlope:
        //Line 1 slope: 1.3333333333333333
        //Line 2 slope: -0.5
        System.out.println(One.getSlope());
        System.out.println(Two.getSlope());

        //Testing isCollinear:
        //Line1 and p3: false 
        //Line1 and p4: true
        System.out.println(One.isCollinear(p3));
        System.out.println(One.isCollinear(p4));
    }
    
}
