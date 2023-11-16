package util;

public enum Properties {
    N,
    E,
    S,
    W;

    private String direction;
    public String getDirection(){
        return direction;
    }

//    Properties(String direction){
//        this.direction = direction;
//    }


    public Properties turnRight(){
        return values()[this.ordinal()+1];
    }
    public Properties turnLeft(){
        return values()[this.ordinal()-1];
    }
}
