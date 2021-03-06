public class Line2D 
{
    
    private Point p1;
    private Point p2;
    public Line2D(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;

    }
    public Line2D (int x1, int y1, int x2, int y2)
    {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }
    public String getP1()
    {
        return "[" + p1.getX() + "," + p1.getY() + "] ";
    }
    public String getP2()
    {
        return "[" + p2.getX() + "," + p2.getY() + "]";
    }
    public String toString() 
    {
        return "[" + p1.getX() + "," + p1.getY() + "] " + "[" + p2.getX() + "," + p2.getY() + "]";
    }
    public double getSlope() 
    {
        if(p1.getX() == p2.getX())
        {
            throw new IllegalArgumentException("undefined slope");
        }
        return ((double)(p2.getY() - p1.getY())) / (p2.getX() - p1.getX());
    }
    public boolean isCollinear(Point p) 
    {
        double slope1 = (double)(p1.getY() - p.getY()) / (p1.getX() - p.getX());
        double slope2 = (double)(p2.getY() - p.getY()) / (p2.getX() - p.getX());
        return slope1 == slope2;
    }
}
