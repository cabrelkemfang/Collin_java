// Fig. 6.12: DrawSmileyTest.java
// Test application that displays a smiley face.
//
// Java How to Program, 10th Ed. (Deitel) Page 226

import javax.swing.JFrame;

public class DrawSmileyTest
{
   public static void main( String[] args )
   {
      DrawSmiley panel = new DrawSmiley();
      JFrame application = new JFrame();

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel );
      application.setSize( 230, 250 );
      application.setVisible( true );
   }
}
