package frc.robot.subsystems;

import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class LiftMotor extends SubsystemBase{
    private CANSparkMax lift;

    public LiftMotor(){
        lift = new CANSparkMax(Constants.ArmConstants.liftID, MotorType.kBrushless);
    }
    
   public void ElevatorUp() {
        lift.set(0.2);
    }

    public void ElevatorDown() {
        lift.set(-0.2);
    }

    public void ElevatorOff() {
        lift.stopMotor();
    }
}