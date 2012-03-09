package com.teamupnext.robot.commands;

/**
 *
 * @author Up Next!
 */
public class DriveRight extends CommandBase {

    private double m_timeout;

    public DriveRight() {
        this(0);
    }

    public DriveRight(double timeout) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(driveTrain);
        m_timeout = timeout;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(m_timeout);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.driveWithJoystick(1.0, 0.0, 0.0, 0.0);

        System.out.println("driving right");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        driveTrain.driveWithJoystick(0.0, 0.0, 0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
