package frc.robot.subsystems;

import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Intake extends SubsystemBase{

  public static Solenoid SolenoidPCM1;
  public static Solenoid SolenoidPCM2;

    public Intake(){
      SolenoidPCM1 = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.PneumaticsConstants.Solenoid1ID);
      SolenoidPCM2 = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.PneumaticsConstants.Solenoid2ID);
    }

    public void CloseBoth(){
      Intake.SolenoidPCM1.set(true);
      Intake.SolenoidPCM2.set(true);
    }

    public void OpenBoth(){
      Intake.SolenoidPCM1.set(false);
      Intake.SolenoidPCM2.set(false);
    }

    public void OpenOne(){
      Intake.SolenoidPCM1.set(true);
    }

    public void CloseOne(){
      Intake.SolenoidPCM1.set(false);
    }
}
