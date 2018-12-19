package frc.robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class RobotMap {
    /**
     * Robot Types
     */

    public static enum RobotType {
        TANK, KIWI;
    };

    public static final RobotType currentType = RobotType.TANK;

    /**
     * Ports and other physical addresses
     */
    public static final int leftSparkChannel = 11;
    public static final int rightSparkChannel = 12;

    public static final boolean leftEncoderReverseDirection = false;
    public static final boolean rightEncoderReverseDirection = false;

    public static final EncodingType encoderEncodingType = EncodingType.k4X;
    public static final double encoderDistancePerPulse = 10; // TODO: Tweak me!

    public static final int leftEncoderChannelA = 0;
    public static final int leftEncoderChannelB = 1;

    public static final int rightEncoderChannelA = 2;
    public static final int rightEncoderChannelB = 3;

    /**
     * Operator Interface related constants
     */
    public static final double deadband = 0.02;

    public static final int buttonSquaredInputs = 1;

    /**
     * Autonomous
     */
    public static final double autoSpeedChangePerDegree = (1.0) / 90;

    public static final double gyroCorrection(Gyro g, double initAngle) {
        return (g.getAngle() - initAngle) * -autoSpeedChangePerDegree;
    }

    public static final double autoMinRotation = 0.01;

    public static final double autoSpeedThreshold = 1000;

    public static final double autoDistThreshold = 1;

    public static final double autoSpeedChangePerDist = 1;

    /**
     * Nonconstants
     */
    public static boolean squaredInputs = true;

}
