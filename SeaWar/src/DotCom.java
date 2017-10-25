import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String stringGuess) {
        String result = "missed";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "the end";
            } else {
                result = "got it";
            }
        }
        return result;
    }
}
