package bowlinggame;

import java.util.ArrayList;
import java.util.List;

public class Frame {

    private static final String MISS_TAG = "-";
    protected List<Integer> bowlingPins = new ArrayList<>();

    public Frame(String scoreText) {
        parse(scoreText);
    }

    protected void parse(String scoreText) {
        for (String pinFallText : scoreText.split("")) {
            bowlingPins.add(parseScoreText(pinFallText));
        }
    }

    private int parseScoreText(String pinFallText) {
        return pinFallText.equals(MISS_TAG) ? 0 : Integer.parseInt(pinFallText);
    }

    public int getBowlingPins() {
        return bowlingPins.stream().reduce(0, Integer::sum);
    }

    public int getFirstPinFall() {
        return bowlingPins.get(0);
    }

    public int getSecondPinFall() {
        return bowlingPins.get(1);
    }

    public boolean isStrike() {
        return this instanceof StrikeFrame;
    }

    public boolean isSpare() {
        return this instanceof SpareFrame;
    }
}
