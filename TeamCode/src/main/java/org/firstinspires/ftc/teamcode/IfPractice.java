package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegistrar;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }


    @Override
    public void loop() {
        /*
        boolean aButton = gamepad1.a; // press TRUE, depress false

        if (aButton) {
            telemetry.addData("A Button", "Pressed!");
        } else {
            telemetry.addData("A Button", "Not Pressed!");
        }

        telemetry.addData("A Button State", aButton);
        */

        /*
        double leftY = gamepad1.left_stick_y;

        if (leftY < 0) {
            telemetry.addData("Left Stick", "is Negative");
        }
        else if (leftY > 0) {
            telemetry.addData("Left Stick", "Is greater than 0");
        }
        else {
            telemetry.addData("Left Stick", "is Zero!");
        }

        telemetry.addData("Left Stick Value", leftY);
         */

        /*
        double leftY = gamepad1.left_stick_y;

        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left Stick", "In Dead Zone");
        }

        telemetry.addData("Left Stick Value", leftY);

         */

        // following code doubles the left stick y value when the a button is pressed
        double motorSpeed = gamepad1.left_stick_y;

        if (!gamepad1.a) {
            motorSpeed *= 0.5;
        }

        telemetry.addData("Motor Speed", motorSpeed);



        /*

        AND - &&    if (leftY < 0.5 && leftY > 0) {
        OR - ||     if (leftY < 0 || right Y < 0) {
        NOT - !     if (!clawClosed) {
         */
    }
}
