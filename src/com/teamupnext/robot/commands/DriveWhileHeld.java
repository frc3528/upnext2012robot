package com.teamupnext.robot.commands;

/**
 *
 * @author Up Next!
 */
public class DriveWhileHeld extends CommandBase {

    public DriveWhileHeld() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.driveWithJoystick(0, .5, 0, 0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        driveTrain.driveWithJoystick(0, 0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        driveTrain.driveWithJoystick(0, 0, 0, 0);
    }
}
