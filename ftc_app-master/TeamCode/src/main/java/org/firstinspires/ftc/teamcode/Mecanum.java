package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Mecanum extends LinearOpMode {
    private DcMotor frontLeft = null;
    private DcMotor frontRight = null;
    private DcMotor backLeft = null;
    private DcMotor backRight = null;

    @Override
    public void runOpMode()
    {
        frontLeft = hardwareMap.get(DcMotor.class , "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class , "frontRight");
        backLeft = hardwareMap.get(DcMotor.class ,  "backLeft");
        backRight = hardwareMap.get(DcMotor.class , "backRight");
        while(opModeIsActive())
        {
            if(this.gamepad1.left_stick_x==0 && this.gamepad1.left_stick_y==0)
            {
                frontRight.setPower(0.0);
                frontLeft.setPower(0.0);
                backRight.setPower(0.0);
                backLeft.setPower(0.0);
            }
            if(this.gamepad1.left_stick_x==0 && this.gamepad1.left_stick_y!=0)
            {
                frontRight.setPower(-this.gamepad1.left_stick_y);
                frontLeft.setPower(-this.gamepad1.left_stick_y);
                backRight.setPower(-this.gamepad1.left_stick_y);
                backLeft.setPower(-this.gamepad1.left_stick_y);
            }
            if(this.gamepad1.left_stick_x!=0 && this.gamepad1.left_stick_y==0)
            {
                frontRight.setPower(-this.gamepad1.left_stick_x);
                frontLeft.setPower(this.gamepad1.left_stick_y);
                backRight.setPower(this.gamepad1.left_stick_y);
                backLeft.setPower(-this.gamepad1.left_stick_y);
            }
            if(this.gamepad1.left_stick_x>0 && this.gamepad1.left_stick_y<0)
            {
                frontLeft.setPower(0.75);
                backRight.setPower(0.75);
            }
            if(this.gamepad1.left_stick_x<0 && this.gamepad1.left_stick_y>0)
            {
                frontLeft.setPower(-0.75);
                backRight.setPower(-0.75);
            }
            if(this.gamepad1.left_stick_x<0 && this.gamepad1.left_stick_y<0)
            {
                frontRight.setPower(0.75);
                backLeft.setPower(0.75);
            }
            if(this.gamepad1.left_stick_x>0 && this.gamepad1.left_stick_y>0)
            {
                frontRight.setPower(-0.75);
                backLeft.setPower(-0.75);
            }
            if(this.gamepad1.right_stick_x!=0 && this.gamepad1.right_stick_y==0)
            {
                frontRight.setPower(-this.gamepad1.right_stick_x);
                frontLeft.setPower(this.gamepad1.right_stick_x);
                backRight.setPower(-this.gamepad1.right_stick_x);
                backLeft.setPower(this.gamepad1.right_stick_x);
            }
        }
    }
}
