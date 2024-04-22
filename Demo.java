
//comments
class Room{
      int height ;
      int width ;
      int breadth;
      int val;
     Room (int h,int w,int b)
     {
     height=h ;
     width =w ;
     breadth= b;
     }
    int volume()
    {
     val=height*breadth*width;
     return val ; 
    }
    public static void main(String arg[])
    {
    Room r= new Room(2,3,4);
    int res = r.volume();
    System.out.println(res);
    }
 }         