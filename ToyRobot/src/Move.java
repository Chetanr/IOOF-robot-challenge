public class Move extends Robot{


    public Move(int xDirection, int yDirection, String currentFace) {
        super(xDirection, yDirection, currentFace);
    }

    public void moveRobot(Robot robot){
        if (robot.currentFace.equals("east"))
        {
            if ((robot.xDirection) > 0)
            {
                robot.xDirection = robot.xDirection - 1 ;
            }
            else{
                System.out.println(robot.xDirection);
                System.out.println("robot falling off the table, move ignored");
            }
        }
        else if (robot.currentFace.equals("west"))
        {
            if ((robot.xDirection) < 4)
            {
                robot.xDirection = robot.xDirection + 1 ;
            }
            else{
                System.out.println("robot falling off the table, move ignored");
            }
        }
        else if (robot.currentFace.equals("north"))
        {
            if ((robot.yDirection) < 4)
            {
                robot.yDirection = robot.yDirection + 1 ;
            }
            else{
                System.out.println("robot falling off the table, move ignored");
            }
        }
        else if (robot.currentFace.equals("south"))
        {
            if ((robot.yDirection) > 0)
            {
                robot.yDirection = robot.yDirection - 1 ;
            } else{
                System.out.println("robot falling off the table, move ignored");
            }
        }
    }
    
}
