public class DebugPen
{
   private String color;
   private String point;
   public DebugPen()
   {
      color = "black";
      point = "fine";
   }
   public DebugPen(String c, String p)
   {
      color = c;
      point = p;
   }
   public String getColor()
   {
      return color;
   }
   public String getPoint()
   {
      return point;
   }
}
