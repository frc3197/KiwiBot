package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ToggleSquaredInputs;

public class OI {
  public Joystick stick = new Joystick(0);
  public JoystickButton toggleSquared = new JoystickButton(stick, RobotMap.buttonSquaredInputs);

  public OI() {
    toggleSquared.whenPressed(new ToggleSquaredInputs());
  }
}