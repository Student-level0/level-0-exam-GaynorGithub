import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot rob = new Robot("batman");
   	 // 3. ask the user what color they would like the Robot to draw
    	String color = JOptionPane.showInputDialog("What color would you like? Red or Blue?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if(color.equalsIgnoreCase("red")) {
    		rob.setPenColor(255,0,0);
    	}
    	else	 if(color.equalsIgnoreCase("blue")) {
    		rob.setPenColor(0,0,255);
    	}
   	 // 2. set the pen width to 10
    	rob.setPenWidth(30);
   	 // 1. make the Robot draw a shape
    	rob.penDown();
    	rob.setSpeed(1000);
    	rob.move(100);
    rob.setAngle(90);
    	rob.move(100);
    	rob.setAngle(180);
    	rob.move(100);
    	rob.setAngle(270);
    	rob.move(100);
    	
    }

}
