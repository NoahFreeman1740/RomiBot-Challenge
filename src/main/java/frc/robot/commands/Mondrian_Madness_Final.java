// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class Mondrian_Madness_Final extends SequentialCommandGroup {
  private double scaleLeft = 1.055;
  private double scaleRight = 1.0;
  
  // We had to add scales to the power in because of performance differences between the two motors

  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public Mondrian_Madness_Final(Drivetrain drivetrain) {
    addCommands(
      straight(0.58, 0.46, drivetrain),
      turn(0.645, 0.8, 1.12, drivetrain),
      turn(0.405, 0.7, 0.93, drivetrain),
      straight(0.75, 0.8, drivetrain),
      turn(0.75, 0.4, 0.75, drivetrain),
      turn(0.76, 0.61, 1.1, drivetrain),
      straight(0.75, 0.3, drivetrain));
      
// Above is the series of command we used for the submitted autonomous run

  }

  private CommandBase straight(double power, double time, Drivetrain drivetrain){
    return new TankDriveTime(power * scaleLeft, power* scaleRight, time, drivetrain);

   }
   
   private CommandBase turn(double powerLeft, double powerRight, double time, Drivetrain drivetrain){
    return new TankDriveTime(powerLeft * scaleLeft, powerRight  * scaleRight, time, drivetrain);
   }
}
