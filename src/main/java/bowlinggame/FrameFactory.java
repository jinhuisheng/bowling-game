package bowlinggame;

public class FrameFactory {
    public static Frame create(String scoreText) {
        if (Frame.isStrike(scoreText)) {
            return new StrikeFrame(scoreText);
        }
        if (Frame.isSpare(scoreText)) {
            return new SpareFrame(scoreText);
        }
        return new Frame(scoreText);
    }
}