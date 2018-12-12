package frc3197.demo;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;

public class Sensors {
    public ADXRS450_Gyro gyro = new ADXRS450_Gyro();

    public Encoder leftEncoder = new Encoder(RobotMap.leftEncoderChannelA, RobotMap.leftEncoderChannelB,
            RobotMap.leftEncoderReverseDirection, RobotMap.encoderEncodingType);
    public Encoder rightEncoder = new Encoder(RobotMap.rightEncoderChannelA, RobotMap.rightEncoderChannelB,
            RobotMap.rightEncoderReverseDirection, RobotMap.encoderEncodingType);

    public Sensors() {
        leftEncoder.setDistancePerPulse(RobotMap.encoderDistancePerPulse);
        rightEncoder.setDistancePerPulse(RobotMap.encoderDistancePerPulse);
    }
}