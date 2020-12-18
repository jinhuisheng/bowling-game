package bowlinggame;


public class BowlingGame {

    private final Frames frames;

    public BowlingGame(String scoreText) {
        ScoreTextParser scoreTextParser = new ScoreTextParser(scoreText);
        frames = new Frames(scoreTextParser.parseFrames(), scoreTextParser.parseExtraBalls());
    }

    public Integer score() {
        return frames.score();
    }
}
