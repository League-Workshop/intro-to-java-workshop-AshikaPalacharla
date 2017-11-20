package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot shawnMendes = new Robot("mini");		

		// 5. Set your robot's pen to the down position
		shawnMendes.penDown();

		// 3. Set the robot to go at max speed (10)
		shawnMendes.setSpeed(10);
		// 4. Do the following (steps 6-8) 75 times
		for(int i=0; i<75;i++) {
			// 7. Change the pen  to random
		shawnMendes.setPenColor(Color.CYAN);
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
		shawnMendes.move(5*i);
			// 2. Turn the robot 1/7 of 360 degrees to the right
		shawnMendes.turn(360/7);
			// 8. Set the pen width to i
		shawnMendes.setPenWidth(i);
		}
		
	}
}
