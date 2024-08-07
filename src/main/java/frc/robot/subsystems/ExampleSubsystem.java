// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.NeutralModeValue;

import frc.robot.commands.ExampleCommand;
import frc.util.SuperSystem;
import frc.util.PID.Gains;
import frc.util.motor.SuperTalonFX;
import frc.util.motor.SuperTalonFXPheonix6;


// Yteam Example Subsystem
public class ExampleSubsystem extends SuperSystem {
  // Motors, Selenoid and Sensors declaration
  public SuperTalonFXPheonix6 motor;
  public Gains gains = new Gains(getName(), 0.1, 0, 0);

  public ExampleSubsystem() {
    super("ExampleSubsystem");
    motor = new SuperTalonFXPheonix6(1, "rio", InvertedValue.Clockwise_Positive, NeutralModeValue.Brake, gains, 0, 0, 0);
    setDefaultCommand(new ExampleCommand(this, 0));
  }
  public void motorOutput(double output) {
    motor.setMotorOutput(output);
  }
  /** Creates a new ExampleSubsystem. */
  
  @Override
  public void periodic() {
    System.out.println("ROBOT IS ON");
    // This method will be called once per scheduler run
  }

}
