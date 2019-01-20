package frc.robot;

public class RobotMap {

    public static enum TalonID {
        FRONT(0), BACKLEFT(1), BACKRIGHT(2);

        public final int id;

        private TalonID(int id) {
            this.id = id;
        }
    };

    /**
     * Operator Interface related constants
     */
    public static final int buttonSquaredInputs = 1;
}
