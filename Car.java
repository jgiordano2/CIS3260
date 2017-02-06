public class Car {

    int location;
    int gear = 1;
    int speed = 0;
    final int destination = 250;

    void reverseGear(){
        gear = -1;
    }

    void gearUp(){
        ++gear;
    }

    void gearDown(){
        --gear;
    }

    int reportGear(){
        return gear;
    }

    int reportLocation(){
            return location;
    }

    int reportRemaining(){
            return (destination-location);
    }

    int time;

    void moveByTime(int time){
        speed = gear *20;


    }
    boolean isArrived(){
            if (location >= destination);
                    return true;
            }
        


}

