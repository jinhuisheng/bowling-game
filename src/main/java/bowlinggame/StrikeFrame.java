package bowlinggame;

public class StrikeFrame extends Frame {
    public StrikeFrame(String scoreText) {
        super(scoreText);
    }

    @Override
    protected void parse(String scoreText) {
        bowlingPins.add(10);
    }
}
