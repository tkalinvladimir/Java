import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        SnakeSection head = new SnakeSection(x, y);
        sections = new ArrayList<>();
        sections.add(head);
        isAlive = true;
    }

    public int getX(){
        return sections.get(0).getX();
    }

    public int getY(){
        return sections.get(0).getY();
    }

    public void move(){
        if (!isAlive) return;
        switch (direction) {
            case UP:
                move(0, -1);
                break;
            case RIGHT:
                move(1, 0);
                break;
            case DOWN:
                move(0, 1);
                break;
            case LEFT:
                move(-1, 0);
                break;
        }
    }

    public void move(int dx, int dy) {
        SnakeSection head = sections.get(0);
        SnakeSection newHead = new SnakeSection(head.getX()+dx, head.getY()+dy);
        checkBody(newHead);
        checkBorders(newHead);
        if (isAlive) {
            sections.add(0, newHead);
            if (Room.game.getMouse().getX() == newHead.getX() && Room.game.getMouse().getY() == newHead.getY()) {
                Room.game.eatMouse();
            } else {
                sections.remove(sections.size() - 1);
            }
        }
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    void checkBorders(SnakeSection head) {
        if (head.getX() >= Room.game.getWidth() || head.getY() >= Room.game.getHeight()) isAlive = false;
    }

    void checkBody(SnakeSection head) {
        if (sections.contains(head)) isAlive = false;
    }
}
