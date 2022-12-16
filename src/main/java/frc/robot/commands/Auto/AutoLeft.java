package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Drivebase;

public class AutoLeft extends SequentialCommandGroup {
  private final Drivebase m_drivebase;

  public AutoLeft(Drivebase drivebase) {
    m_drivebase = drivebase;

    addCommands( 
      new AutoDrive(m_drivebase, .75, -0.9).withTimeout(5)
    );

  }

} 