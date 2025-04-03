package org.firstinspires.ftc.teamcode;

public class MM_Drivetrain {
    MM_OpMode opMode;
    MM_Navigation navigation;

    public MM_Drivetrain(MM_OpMode opMode){
        this.opMode = opMode;
        navigation = new MM_Navigation(opMode);
    }

}
