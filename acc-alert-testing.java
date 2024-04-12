public class AlertTester {
    public static void main(String[] args) {
        boolean pedestrianDetected = true;
        boolean vehicleTooClose = false;
        boolean sharpTurnAhead = true;

        if (pedestrianDetected) {
            System.out.println("[ALERT] Pedestrian detected!");
        }

        if (vehicleTooClose) {
            System.out.println("[ALERT] Vehicle too close!");
        }

        if (sharpTurnAhead) {
            System.out.println("[ALERT] Sharp turn ahead!");
        }
    }
}
 
