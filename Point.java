public class Point
{
    private int x;
    private int y;
    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(int userX, int userY)
    {
        x = userX;
        y = userY;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void changeX(int changeX)
    {
        x = changeX;
    }
    public void changeY(int changeY)
    {
        y = changeY;
    }
    public int manhattanDistance(Point other)
    {
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }
    public boolean isCollinear(Point p1, Point p2)
    {
        if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
            return true;
        } else {
            double slope1 = (double)(this.y - p1.y) / (double)(this.x - p1.x);
            double slope2 = (double)(this.y - p2.y) / (double)(this.x - p2.x);
            return slope1 == slope2; 
        }
    }

}
