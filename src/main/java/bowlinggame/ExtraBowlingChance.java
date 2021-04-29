package bowlinggame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraBowlingChance {
    private List<Integer> bowlingPins;

    public ExtraBowlingChance(String scoreText) {
        bowlingPins = parse(scoreText);
    }

    private List<Integer> parse(String scoreText) {
        return Arrays.stream(scoreText.split("")).map(x -> 10).collect(Collectors.toList());
    }

    public int getFirstBowlingPins() {
        return bowlingPins.get(0);
    }

    public int getSecondBowlingPins() {
        return bowlingPins.get(1);
    }
}
