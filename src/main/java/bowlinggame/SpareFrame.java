package bowlinggame;

public class SpareFrame extends Frame {
    public SpareFrame(String scoreText) {
        super(scoreText);
    }

    @Override
    protected void parse(String scoreText) {
        int firstPinFall = Integer.parseInt(scoreText.substring(0, 1));
        bowlingPins.add(firstPinFall);
        bowlingPins.add(10 - firstPinFall);
    }
}
