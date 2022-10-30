package state;

public class Elevator {

    public static int current_Floor = 5;
    int dest_Floor;

    private Elv_States State = new Elv_States();

    public Elevator(int dest_floor) {
        this.dest_Floor = dest_floor;
        System.out.println("*** Destination floor is: " + dest_Floor);
        arrive_atFloor();


    }

    private void arrive_atFloor() {
        if (current_Floor > dest_Floor) {
            State.Current_State = State.Moving_down;
            System.out.println(State.Current_State);
            while (current_Floor > dest_Floor) {
                current_Floor--;
                System.out.println(current_Floor);
            }
            State.Current_State = State.Idle;
            System.out.println(announceFloor(current_Floor));
        } else if (current_Floor < dest_Floor) {
            State.Current_State = State.Moving_up;
            System.out.println(State.Current_State);
            while (current_Floor < dest_Floor) {
                current_Floor++;
                System.out.println(current_Floor);
            }
            State.Current_State = State.Idle;
            System.out.println(announceFloor(current_Floor));
        } else {
            State.Current_State = State.Idle;
            System.out.println(State.Current_State);
            System.out.println(announceFloor(current_Floor));
        }
    }

    private String announceFloor(int current_Floor){
        switch(current_Floor){
            case 1:
                return "DING DING! Welcome to the 1st floor!";
            case 2:
                return "DING DING! Welcome to the 2nd floor!";
            case 3:
                return "DING DING! Welcome to the 3rd floor!";
            default:
                return "DING DING! Welcome to the "+current_Floor+"th floor!";
        }
    }


}