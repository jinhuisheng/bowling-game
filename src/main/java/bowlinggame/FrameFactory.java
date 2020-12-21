package bowlinggame;

public class FrameFactory {
    private static final String STRIKE_TAG = "X";

    private static final String SPARE_TAG = "/";

    private FrameFactory() {
    }

    public static Frame create(String scoreText) {
        if (isStrike(scoreText)) {
            return new StrikeFrame(scoreText);
        }
        if (isSpare(scoreText)) {
            return new SpareFrame(scoreText);
        }
        return new Frame(scoreText);
    }

    public static boolean isStrike(String scoreText) {
        return scoreText.equals(STRIKE_TAG);
    }

    public static boolean isSpare(String scoreText) {
        return scoreText.contains(SPARE_TAG);
    }

}