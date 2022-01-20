public class TestLine2D
{
    public static void main(String[] args)
    {
        PointForLineProject p1 = new PointForLineProject();
        PointForLineProject p2 = new PointForLineProject(3,4);
        PointForLineProject p3 = new PointForLineProject(4,9);
        PointForLineProject p4 = new PointForLineProject(6,8);

        Line2D One = new Line2D(p1,p2);
        Line2D Two = new Line2D(p3,p4);
        Line2D Coords4 = new Line2D(4,9,6,8);

        //Testing constructor using 2 Point objects and the toString method 
        //Line 1: [(0,0), (3,4)] Line 2: [(4,9), (6,8)]
        //Prints objects point in memory instead of returning the coords 

        System.out.println(One.toString());
        System.out.println(Two.toString());

        //Testing constructor using 4 int's and the toString method 
        //Line 3: [(4,9), (6,8)]
        //Print osu an Error instead of coords
        System.out.println(Coords4.toString());



    }
    
}
