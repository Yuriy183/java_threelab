import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ArrayList<Square> Squares = new ArrayList<>();
        ArrayList<SquarePrism> Prisms = new ArrayList<>();

        int maxSquare = 0;
        double maxDiagonal = 0;
        byte flagSquare = -1;
        byte flagDiagonal = -1;

        for (int i = 0; i <= 10; i++) {
            Squares.add(new Square((int) (Math.random() * 9 + 1)));
            Prisms.add(new SquarePrism((int) (Math.random() * 9 + 1), i));

            int currentSquare = Squares.get(i).calcSquare();
            if (currentSquare > maxSquare) {
                maxSquare = currentSquare;
                flagSquare = (byte) i;
            }

            double currentDiagonal = Prisms.get(i).calcDiagonal();
            if (currentDiagonal > maxDiagonal) {
                maxDiagonal = currentDiagonal;
                flagDiagonal = (byte) i;
            }
        }

        String Square = "|" + Squares.get(flagSquare).getSide();
        String Prism = "|" + Prisms.get(flagDiagonal).getSide() + "|" + Prisms.get(flagDiagonal).getHeight();

        SaveFile.saveFile(Square, Prism);

        String fileName = "1603102310590";

        System.out.println("MaxSquare: \n" + SaveFile.loadFile(fileName).get(0).toString() +
                "\n\nMaxPrism: \n" + SaveFile.loadFile(fileName).get(1).toString());
    }
}