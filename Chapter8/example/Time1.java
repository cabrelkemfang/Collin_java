package Chapter8.example;
// Fig. 8.1: Time1.java
// Time1 class declaration maintains the time in 24-hour format.
//
// Java How to Program, 10th Ed. (Deitel) Page 313


public class Time1
{
   public int hour;
   public int minute;
   public int second;

   public void setTime( int h, int m, int s )
   {
      // validate hour, minute, and second
      if ( ( h >= 0 && h < 24 ) && ( m >= 0 && m < 60 ) &&
         ( s >= 0 && s < 60 ) )
      {
         hour = h;
         minute = m;
         second = s;
      }
      else
         throw new IllegalArgumentException(
            "hour, minute, and/or second was out of range" );
   }

   public String toUniversalString()
   {
      return String.format( "%02d:%02d:%02d", hour, minute, second );
   }

   public String toString()
   {
      return String.format( "%d:%02d:%02d %s",
         ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
         minute, second, ( hour < 12 ? "AM" : "PM" ) );
   }
}

/* Code execution

$ java Time1Test
The initial universal time is: 00:00:00
The initial standard time is: 12:00:00 AM

Universal time after setTime is: 13:27:06
Standard time after setTime is: 1:27:06 PM

Exception: hour, minute, and/or second was out of range

After attempting invalid settings:
Universal time: 13:27:06
Standard time: 1:27:06 PM

*/
