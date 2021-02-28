// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class Mondrian_Madness extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public Mondrian_Madness(Drivetrain drivetrain) {
    addCommands(
      new TankDriveTime(0.5, 0.5, 0.5, drivetrain),
      new TankDriveTime(0.5, 0.58, 2.3, drivetrain),
      new TankDriveTime(0.3, 0.55, 1.62, drivetrain),
      new TankDriveTime(0.52, 0.5, 2.2, drivetrain),
      new TankDriveTime(0.5, 0.2, 1.52, drivetrain),
      new TankDriveTime(0.59, 0.49, 2.85, drivetrain));
   
      // This is a series of commands used for slower-paced testing, this is not the submitted run
  }
}
