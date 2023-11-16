package model;

import util.Properties;

public class Robot implements Action {
    private String direction;
    private String[] commands;
//    private String position;
    private int x;
    private int y;
    @Override
    public void robotMovement(String direction, int x, int y) {
        Properties direct = Properties.valueOf(direction);
        int index = 0;
        for (String c : commands){
            if (c.equalsIgnoreCase("A" ) && direct.equals(Properties.E)){
                this.x++;
                System.out.println(">"+c+" -> "+"( "+getX()+","+getY()+" )"+getDirection());
            } else if (c.equalsIgnoreCase("A" ) && direct.equals(Properties.W)) {
                this.x--;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )"+getDirection());
            } else if (c.equalsIgnoreCase("A" ) && direct.equals(Properties.N)) {
                this.y++;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )"+getDirection());
            } else if (c.equalsIgnoreCase("A" ) && direct.equals(Properties.S)) {
                this.y--;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )"+getDirection());
            } else if (c.equalsIgnoreCase("R" )) {
                this.direction = String.valueOf(direct.turnRight());
//                direct.turnRight();
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )"+getDirection());
            } else if (c.equalsIgnoreCase("L" )) {
                this.direction = String.valueOf(direct.turnLeft());
//                direct.turnLeft();
                System.out.println(">"+c+" ->"+"( "+getX()+" "+getY()+" )"+getDirection());
            }else {
                System.out.println("Invalid command !!");
            }
        }
    }

    public String[] getCommands() {
        return commands;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void direction(){
//        if ()
    }
}
