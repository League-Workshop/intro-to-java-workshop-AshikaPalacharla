package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello world!");
	
	Robot shawnMendes = new Robot("batman");		
	shawnMendes.setSpeed(100);
	shawnMendes.sparkle();
	shawnMendes.setPenColor(Color.red);
	shawnMendes.penDown();
	shawnMendes.move(200);
	shawnMendes.turn(90);
	shawnMendes.move(200);
	shawnMendes.turn(90);
	shawnMendes.move(200);
	shawnMendes.turn(90);
	shawnMendes.move(200);
	shawnMendes.turn(45);
	shawnMendes.move(200);
	shawnMendes.turn(-90);
	shawnMendes.move(200);
	shawnMendes.turn(-135);
	shawnMendes.move(250);
	}
}
