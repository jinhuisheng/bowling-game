package bowlinggame;

import java.util.ArrayList;
import java.util.List;

public class ExtraBalls {
    private static final String STRIKE_TAG = "X";

    private List<Integer> bowlingPins = new ArrayList<>();

    public ExtraBalls(String scoreText) {
        for (String str : scoreText.split("")) {
            bowlingPins.add(parseScoreText(str));
        }
    }

    private int parseScoreText(String scoreText) {
        return scoreText.contains(STRIKE_TAG) ? 10 : Integer.parseInt(scoreText);
    }

    public int getFirstPinFall() {
        return bowlingPins.get(0);
    }

    public int getSecondPinFall() {
        return bowlingPins.get(1);
    }
}
