package Chapter5.examples;
// Fig. 5.26: Shapes.java
// Demonstrates drawing different shapes.
// Java How to Program, 10th Ed. (Deitel) Page 184

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
   private int choice; // user's choice of which shape to draw

   // constructor
   public Shapes( int userChoice )
   {
      choice = userChoice;
   }

   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      for ( int i = 0; i < 10; i++ )
      {
         switch ( choice )
         {
            case 1: // draw rectangles
               g.drawRect( 10 + i * 10, 10 + i * 10,
                  50 + i * 10, 50 + i * 10 );
               break;
            case 2: // draw ovals
               g.drawOval( 10 + i * 10, 10 + i * 10,
                  50 + i * 10, 50 + i * 10 );
               break;
         }
      }
   }
}
