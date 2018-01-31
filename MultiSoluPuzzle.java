package lines;
import javax.swing.*;
import java.awt.*;
import java.math.*;
/**
   This class is an applet that demonstrates how lines
   can be drawn.
*/
public class MultiSoluPuzzle extends JApplet
{
   /**
      init method
   */

   public void init()
   {
      // Set the background color to white.
      getContentPane().setBackground(Color.black);
   }

   /**
      paint method
      @param g The applet's Graphics object.
   */

   public void paint(Graphics g)
   {
      String input = JOptionPane.showInputDialog("How many divisions?");
      double divisions = Double.parseDouble(input);
      double rootAngle = 180/divisions;
      final int length = 100;
          double currentx = 1100;
          double currenty = 1100;
          int intVarx = (int)currentx;
          int intVary = (int)currenty;
           double cosAngle = Math.cos(rootAngle);
           double sinAngle = Math.sin(rootAngle);
       int intsinangle = (int) sinAngle;
       int intcosangle = (int) cosAngle;
      for(int n=0;n<divisions;n++){
          g.drawLine(intVarx,intVary, intcosangle*n*length + intVarx,
                   n*intcosangle*length + intVary);
          currentx = currentx + Math.cos(rootAngle);
          currenty = currenty +length*Math.sin(rootAngle)*length;
      }
       
       
      super.paint(g);
      
    
      
      
      
      g.setColor(Color.green);
      g.drawLine(1100, 1100,1200,1100);
      
      g.setColor(Color.blue);
      g.drawLine(1200, 1100, 1287, 1050);
      
      g.setColor(Color.blue);
      g.drawLine(1287,1050, 1337,967);

      g.setColor(Color.blue);
      g.drawLine(1187,1050, 1237,967);
      
      g.setColor(Color.green);
      g.drawLine(1287,1050, 1187,1050);

      g.setColor(Color.red);
      g.drawLine(1337,967, 1237,967);

      g.setColor(Color.red);
      g.drawLine(1337,967, 1337,867);

      g.setColor(Color.red);
      g.drawLine(1237,867, 1337,867);

      g.setColor(Color.red);
      g.drawLine(1187,780, 1100,826);

      g.setColor(Color.red);
      g.drawLine(1187,780, 1237,867);

      g.setColor(Color.red);
      g.drawLine(1237,967, 1237,867);
      
      g.setColor(Color.red);
      g.drawLine(1150,913, 1237,867);
                
      g.setColor(Color.blue);
      g.drawLine(1187,1050, 1100,1100);
   
      g.setColor(Color.blue);
      g.drawLine(1100,1100, 1150,1013);

      g.setColor(Color.red);
      g.drawLine(1100,1100, 1100,1000);

      g.setColor(Color.red);
      g.drawLine(1150,1013, 1150,913);
      
      g.setColor(Color.green);
      g.drawLine(1100,1000, 1150,913);
      
      g.setColor(Color.green);
      g.drawLine(1100,1000, 1050,913);
      
      g.setColor(Color.green);
      g.drawLine(1100,826, 1050,913);
      
      g.setColor(Color.green);
      g.drawLine(1100,826, 1150,913);
      
      g.setColor(Color.blue);
      g.drawLine(1050,1013, 1050,913);
      
      g.setColor(Color.blue);
      g.drawLine(1100,1100, 1050,1013);
      
      g.setColor(Color.red);
      g.drawLine(1013,1050, 1100,1100);
      
      g.setColor(Color.blue);
      g.drawLine(1237,967, 1150,1013);
      
      g.setColor(Color.blue);
      g.drawLine(1237,967, 1150,1013);

      g.setColor(Color.blue);
      g.drawLine(1050,1013, 963, 957);
      
      g.setColor(Color.blue);
      g.drawLine(1013,1050, 963, 957);
      
      g.setColor(Color.blue);
      g.drawLine(963,857, 963, 957);
      
      g.setColor(Color.blue);
      g.drawLine(963,857, 1050, 913);
      
      g.setColor(Color.blue);
      g.drawLine(1100,826, 1013, 775);
      
      g.setColor(Color.blue);
      g.drawLine(963,857, 1013, 775);
      
      g.setColor(Color.blue);
      g.drawLine(1100,729, 1013, 775);
      
      g.setColor(Color.blue);
      g.drawLine(1100,729, 1200, 729);
      
      g.setColor(Color.blue);
      g.drawLine(1287,780, 1200, 729);

      g.setColor(Color.red);
      g.drawLine(1187,780,1100,729);

      g.setColor(Color.red);
      g.drawLine(1187,780,1287,780);

      g.setColor(Color.red);
      g.drawLine(1287,780, 1337,867);   
      
      
      g.setColor(Color.green);
      g.drawLine(600,600, 700,600);
      
      g.setColor(Color.green);
      g.drawLine(700,600, 790,557);
      
      g.setColor(Color.green);
      g.drawLine(600,600, 690,557);
      
      g.setColor(Color.green);
      g.drawLine(690, 557,790,557);
      
      g.setColor(Color.green);
      g.drawLine(662,522 ,600,600);
      
      g.setColor(Color.green);
      g.drawLine(690,557 ,752,479);
      
      g.setColor(Color.green);
      g.drawLine(662,522 ,752,479);
      
      g.setColor(Color.green);
      g.drawLine(852,479 ,752,479);
      
      g.setColor(Color.green);
      g.drawLine(852,479 ,790,557);
      
      g.setColor(Color.red);
      g.drawLine(600,600 ,622,503);
      
      g.setColor(Color.blue);
      g.drawLine(684,429 ,622,503);
      
      g.setColor(Color.green);
      g.drawLine(684,429 ,662,522);
      
        g.setColor(Color.red);
        g.drawLine(774,386 ,752,479);
      
      g.setColor(Color.green);
      g.drawLine(684,429 ,774,386);
      
      g.setColor(Color.orange);
      g.drawLine(874,386 ,774,386);
      
      g.setColor(Color.blue);
      g.drawLine(852,479 ,874,386);
      
      g.drawLine(600,600,578 ,503);
      g.drawLine(600,406,578 ,503);
      
      g.setColor(Color.blue);
      g.drawLine(600,406,622 ,503);
      g.drawLine(600,406,662 ,332);
      g.drawLine(684,429,662 ,332);
      g.drawLine(774,386,752,289);
      g.drawLine(852,289,752,289);
      g.drawLine(874,386,852,289);  
      g.drawLine(662,332,752,289);
      
      g.setColor(Color.red);
      g.drawLine(600,600,538,522);
      g.drawLine(448,479,538,522);
      g.drawLine(600,600,510,557);
      
      g.drawLine(516,425,578,503);
      g.setColor(Color.yellow);
      g.drawLine(516,425,538,522);
      g.setColor(Color.blue);
      g.drawLine(448,479,510,557);
      g.drawLine(448,479,426,382    );
      g.drawLine(516,425,426,382    );
      g.drawLine(516,425,538,328    );
      
      g.drawLine(600,406,538 ,328);
      
      g.drawLine(538,328,600,254        );
      g.drawLine(600,254,662 ,332);
      
      
      
      
   }
}  