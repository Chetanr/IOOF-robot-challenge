public class ChangeDirection extends Robot{

    public ChangeDirection(int xDirection, int yDirection, String currentFace) {
        super(xDirection, yDirection, currentFace);
    }

    public void setDirection(Robot robot, String direction)
    {
        if (robot.currentFace.equals("north"))
        {
            if (direction.equals("left"))
            {
                robot.currentFace = "west";
            }
            else
            {
                robot.currentFace = "east";
            }
        }
        else if (robot.currentFace.equals("south"))
        {
            if (direction.equals("left"))
            {
                robot.currentFace = "east";
            }
            else
            {
                robot.currentFace = "west";
            }
            
        }
        else if (robot.currentFace.equals("east"))
        {
            if (direction.equals("left"))
            {
                robot.currentFace = "north";
            }
            else
            {
                robot.currentFace = "south";
            }
            
        }
        else if (robot.currentFace.equals("west"))
        {
            if (direction.equals("left"))
            {
                robot.currentFace = "south";
            }
            else
            {
                robot.currentFace = "north";
            }
            
        }
    }
    
}
