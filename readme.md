The task has been implemented using JAVA. The class diagram of the project can be found in Class Diagram.jpeg file.

**Running the code**
To run the code using the terminal or the command line,

1. navigate to ToyRobot->src directory
2. compile the project using the below command
   javac \*.javac
3. run the code using the below command
   java ToyRobot

**Test Data**
The test data that can be used to test the code is placed in testData.txt file. You
can also use custom data to test the code.

**Exception and Error Handling**

1. The program catches the expection if the user tries to perform any direction move before
   placing the robot using the PLACE command where there user will be prompted to place the
   robot before performing any MOVE or direction (i.e LEFT or RIGHT) commands.
2. Also, if the move makes the robot to fall off the table, a prompt "robot falling off the
   table, move ignored" will be shown and the move is ignored.

**Limitations**

1. The program currently takes into account only LEFT and RIGHT directions. However,
   it can be improved further to handle further directions such TOP RIGHT, TOP LEFT,
   BOTTOM RIGHT and BOTTOM LEFT.
2. The program does not handle the expection if the user tries to use REPORT command for the first time.
