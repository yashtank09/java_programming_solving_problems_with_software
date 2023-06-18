import edu.duke.*;
/**
 * Write a description of PerimeterRunner here.
 * 
 * @author (Yash Tank) 
 * @version (1.0 Program to find perimeter of any shape with distance)
 */
public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        double totalPerim = 0;
        
        Point prevPt = s.getLastPoint();
        
        for(Point currPt: s.getPoints()){
            double currDist = prevPt.distance(currPt);
            
            totalPerim = totalPerim + currDist;
            
            prevPt = currPt;
        }
        return totalPerim;
    }
    
    public double getAvrage (Shape s) {
        double totalPerim = 0;
        
        Point prevPt = s.getLastPoint();
        int sides = 0;
        for(Point currPt: s.getPoints()){
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            sides++;
            prevPt = currPt;
        }
        double avrageOfSides = totalPerim / sides;
        return avrageOfSides;
    }
    
    public double getLongestSide (Shape s) {
        double totalPerim = 0;
        double longestDist = 0;
        Point prevPt = s.getLastPoint();
        for(Point currPt: s.getPoints()){
            double currDist = prevPt.distance(currPt);
            if(currDist > longestDist)
                longestDist = currDist;
            prevPt = currPt;
        }
        return longestDist;
    }
    
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        double avrage = getAvrage(s);
        double longestDist = getLongestSide(s);
        System.out.println("Perimeter = " + length);
        System.out.println("Avrage = " + avrage);
        System.out.println("Longest Side = " + longestDist);        
    }
    
    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
