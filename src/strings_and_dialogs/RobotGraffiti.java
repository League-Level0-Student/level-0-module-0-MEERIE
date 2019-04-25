package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	  Robot asphalt8=new Robot("batman");
	 asphalt8.setSpeed(1);
	  asphalt8.penDown();
	  asphalt8.turn(45);
	  asphalt8.move(200);
	  asphalt8.turn(100);
	  asphalt8.move(200);
	  asphalt8.turn(180);
	  asphalt8.move(100);
	  asphalt8.turn(-45);
	  asphalt8.move(150);
}
}

