package org.firstinspires.ftc.teamcode;

public class MM_Robot {
    MM_OpMode opMode;
    MM_Drivetrain drivetrain = null;

    public MM_Robot(MM_OpMode opMode){
        this.opMode = opMode;
    }
    public void init(){
        drivetrain = new MM_Drivetrain(opMode);

    }

}
