public class Report extends Robot{

    public Report(int xDirection, int yDirection, String currentFace) {
        super(xDirection, yDirection, currentFace);
    }

    public void reportPosition(Robot robot){
        System.out.println(robot.xDirection + "," + robot.yDirection + "," + robot.currentFace);
    }
    
}
