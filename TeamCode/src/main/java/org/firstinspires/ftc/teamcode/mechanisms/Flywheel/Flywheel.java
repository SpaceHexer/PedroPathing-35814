package org.firstinspires.ftc.teamcode.mechanisms.Flywheel;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Flywheel {
    private DcMotorEx m1;

    private double encoderCPM = 28;

    private int gearRatio = 1;

    private double kV, kS, kP;

    public void init(HardwareMap hwMap) {
        m1 = hwMap.get(DcMotorEx.class, "flywheel_motor");

        m1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void setMotorPower(double power) {
        m1.setPower(power);
    }

    public double getTicksPerSec() {
        return m1.getVelocity();
    }

    public double getRPM() {
        return ((getTicksPerSec()/encoderCPM)*60) / gearRatio;
    }
}
