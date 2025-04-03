package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="testTeleOp", group="test")
public class MM_TeleOp extends MM_OpMode{
    @Override
    public void runProcedures(){
        multipleTelemetry.addLine("Helloooo");
        multipleTelemetry.update();
    }
}
