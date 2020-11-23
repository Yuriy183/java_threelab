public class Square implements IFigure {

    protected int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    public int calcSquare() {
        return this.side * this.side;
    }

    public double calcDiagonal() {
        return this.side * Math.sqrt(2);
    }

    public int calcPerimeter() {
        return this.side * 4;
    }

    public String toString() {
        return "Side: " + this.side + '\n' +
                "Square: " + calcSquare() + '\n' +
                "Diagonal: " + calcDiagonal() + '\n' +
                "Perimeter: " + calcPerimeter();
    }
}