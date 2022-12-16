package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;


public class AutoDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Drivebase m_drivebase;
  private Double robot_speed;
  private Double robot_turn;

  public AutoDrive(Drivebase subsystem, Double speed, Double turn) {
    m_drivebase = subsystem;
    robot_speed = speed;
    robot_turn = turn;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivebase.drive(robot_speed, robot_turn);
  }

  @Override
  public void end(boolean interrupted) {
    m_drivebase.stopMotors();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}