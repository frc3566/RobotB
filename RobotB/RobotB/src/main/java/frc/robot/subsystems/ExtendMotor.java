package frc.robot.subsystems;

import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ExtendMotor extends SubsystemBase{
    private CANSparkMax extend;

    public ExtendMotor(){
        extend = new CANSparkMax(Constants.ArmConstants.extendID, MotorType.kBrushless);
    }
    
   public void ElevatorUp() {
        extend.set(0.2);
    }

    public void ElevatorDown() {
        extend.set(-0.2);
    }

    public void ElevatorOff() {
        extend.stopMotor();
    }
}