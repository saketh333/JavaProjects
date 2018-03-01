public class Queen extends Piece{

    Position position = new Position(0,3);

    boolean isValidMove(Position newPosition) {
        return super.isValidMove(position) &&
                ((newPosition.row == this.position.row || newPosition.column == this.position.column) ||
                        ((Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row))));
    }
}