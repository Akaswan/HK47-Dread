// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Belt extends SubsystemBase {
  final CANSparkMax beltMotor;

  /** Creates a new Belt. */
  public Belt() {
    beltMotor = new CANSparkMax(Constants.beltID, MotorType.kBrushed);
  }

  public void slowBelt() {
    beltMotor.set(0.4);
  }

  public void fastBelt() {
    beltMotor.set(0.7);
  }

  public void reverseSlowBelt() {
    beltMotor.set(-0.4);
  }

  public void reverseFastBelt() {
    beltMotor.set(-0.7);
  }

  public void stopMotors() {
    beltMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
