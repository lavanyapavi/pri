 class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
 public class Solution {
    public int maxPoints(Point[] points) {
    int max=0;
    if(points.length==1)
        return 1;
     for(int i=0;i<points.length;i++){
         for(int j=0;j<points.length;j++){
         if((points[i].x!=points[j].x)||(points[i].y!=points[j].y)){
         int coll=get_collinear(points[i].x,points[i].y,points[j].x,points[j].y,points);
                  if(coll>max)
                    max=coll;
                }
                else{

                    **Case where I am suffering**

                }
           }
        }
  return max;
}
public int get_collinear(int x1,int y1,int x2, int y2,Point[] points)
{
    int c=0;
    for(int i=0;i<points.length;i++){
        int k1=x1-points[i].x;
        int l1=y1-points[i].y;
        int k2=x2-points[i].x;
        int l2=y2-points[i].y;
        if((k1*l2-k2*l1)==0)
            c++;
    }
    return c;
}
}
