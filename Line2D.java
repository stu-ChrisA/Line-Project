public class Line2D 
{
    
    private Point p1;
    private Point p2;
    private int xOne;
    private int yOne;
    private int xTwo;
    private int yTwo;
    public Line2D(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;

    }
    public Line2D (int x1, int y1, int x2, int y2)
    {
      this.xOne = x1;
	    this.yOne = y1;
	    this.xTwo = x2;
	    this.yTwo = y2;
    }
    public Point getP1()
    {
        return p1;
    }
    public Point getP2()
    {
        return p2;
    }
    public String toString() 
    {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
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
