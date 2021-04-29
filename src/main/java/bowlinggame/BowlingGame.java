package bowlinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BowlingGame {
    private List<Frame> frames;
    private ExtraBowlingChance extraBowlingChance;

    public BowlingGame(String scoreText) {
        this.frames = parse(scoreText);
        this.extraBowlingChance = parseExtra(scoreText);
    }

    private ExtraBowlingChance parseExtra(String scoreText) {
        return new ExtraBowlingChance(scoreText);
    }

    private List<Frame> parse(String scoreText) {
        String frameScoreText = scoreText.split("\\|\\|")[0];
        return Arrays.stream(frameScoreText.split("\\|"))
                .map(Frame::new)
                .collect(Collectors.toList());
    }

    public static Integer score(String scoreText) {
        BowlingGame bowlingGame = new BowlingGame(scoreText);
        return bowlingGame.score();
    }

    private int score() {
        int score = 0;
        for (int i = 0; i < 10; i++) {
            score += frameScore(i);
        }
        return score;
    }

    private int frameScore(int index) {
        Frame frame = frames.get(index);
        if (index < 8) {
            return frame.getBowlingPins()
                    + frames.get(index + 1).getBowlingPins()
                    + frames.get(index + 2).getBowlingPins();
        }
        if (index == 8) {
            return frame.getBowlingPins()
                    + frames.get(index + 1).getBowlingPins()
                    + extraBowlingChance.getFirstBowlingPins();
        }
        return frame.getBowlingPins()
                + extraBowlingChance.getFirstBowlingPins()
                + extraBowlingChance.getSecondBowlingPins();
    }
}
