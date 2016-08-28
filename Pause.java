/*
Name: Long, Levi
Date: 30/08/2015
*/

public class Pause
{
  public static void wait( double seconds )
  {
     try
     {
       Thread.sleep( (int) ( seconds * 1000 ) );
     }
     catch ( InterruptedException e )
     {
       e.printStackTrace( );
     }
  }
}
