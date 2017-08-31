
class AlertStatus {
    public void alert() {}
}

class NormalStatus extends AlertStatus {
    @Override
    public void alert() { System.out.println("Normal"); }
}

class AlarmStatus extends AlertStatus {
    @Override
    public void alert() { System.out.println("Alarm"); }
}

class DangerStatus extends AlertStatus {
    @Override
    public void alert() { System.out.println("Danger"); }
}

class Starship {
    private AlertStatus alertStatus = new NormalStatus();
    public void changeStatus(AlertStatus status) { alertStatus = status; }
    public void performAlert() { alertStatus.alert(); }
}

public class ex17_1 {
    public static void main(String[] args){
        Starship starship = new Starship();
        starship.performAlert();
        starship.changeStatus(new NormalStatus());
        starship.performAlert();
        starship.changeStatus(new AlarmStatus());
        starship.performAlert();
        starship.changeStatus(new DangerStatus());
        starship.performAlert();

    }
}
