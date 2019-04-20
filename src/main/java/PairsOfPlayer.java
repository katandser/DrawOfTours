public class PairsOfPlayer {
    static final int WHITE_WINS = 0;
    static final int BLACK_WINS = 1;
    static final int DRAW = 2;
    static final int MINUSL_PLUS = 3;
    static final int PLUS_MINUS = 4;
    static final int MINUS_MINUS = 5;
    static final int ZERO_ZERO = 6;
    private Human white;
    private Human black;
    private int result;

    public void setBlack(Human black) {
        this.black = black;
    }

    public void setWhite(Human white) {
        this.white = white;
    }

    public static int getBlackWins() {
        return BLACK_WINS;
    }

    public Human getWhite() {
        return white;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }
}
