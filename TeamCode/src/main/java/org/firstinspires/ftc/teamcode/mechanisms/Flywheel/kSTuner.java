package org.firstinspires.ftc.teamcode.mechanisms.Flywheel;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class kSTuner extends OpMode {

    Flywheel flywheel = new Flywheel();

    @Override
    public void init() {
        flywheel.init(hardwareMap);
    }

    public static double kS = 0;

    @Override
    public void loop() {
        flywheel.setMotorPower(kS);

        telemetry.addData("kS", "%.6f", kS);
        telemetry.addData("RPM", flywheel.getRPM());
        telemetry.addData("Ticks per Sec", flywheel.getTicksPerSec());
    }
}
