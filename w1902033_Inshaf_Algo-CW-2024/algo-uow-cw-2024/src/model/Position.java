package model;
/** *****************************************************************************
 *  Name:    Inshaf Naleem
 *  UOW ID:   W1902033
 *  IIT ID: 20212172
 *
 *  Description:  will help to define and store node object data of position
 *
 *  Written:       20-03-2024
 *  Last updated:  23-04-2024
 *
 **************************************************************************** */
public class Position {
    private int x;
    private int y;

    public Position() {
    }

    public Position(int x, int y) {
        super();
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }
}
