import java.util.Scanner;

public class ToyRobot {
    static Move moveRobot;
    static Robot robot;
    static ChangeDirection direction;
    static Report report;
    
    public static void main(String[] args) throws Exception {
        String command;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the command to place the robot");
        command = scanner.nextLine();
        int x = Character.getNumericValue(command.charAt(6));
        int y = Character.getNumericValue(command.charAt(8));
        String facing = command.substring(10).toLowerCase();
        robot = new Robot(x,y,facing);
        moveRobot = new Move(x,y,facing);
        direction = new ChangeDirection(x, y, facing);
        report = new Report(x, y, facing);
        try{
            do {
                System.out.println("\nEnter the command");
                command = scanner.nextLine();
                processCommand(command, robot);
            } while (!command.equalsIgnoreCase("report"));
            report.reportPosition(robot);
            scanner.close();
        } catch (Exception e){
            System.out.println("Invalid command. Please try again.");
        }
        
    }

    public static void processCommand(String command, Robot robot)
    {
        if (command.contains("move"))
        {
            moveRobot.moveRobot(robot);
        }
        else if (command.contains("left") || command.contains("right"))
        {
            direction.setDirection(robot, command);
        }
    }
}