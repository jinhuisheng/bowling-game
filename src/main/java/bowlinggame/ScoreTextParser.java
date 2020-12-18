package bowlinggame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreTextParser {

    private String[] framesAndExtraBallsArray;

    public ScoreTextParser(String scoreText) {
        framesAndExtraBallsArray = scoreText.split("\\|\\|");
    }

    List<Frame> parseFrames() {
        String framesScoreText = framesAndExtraBallsArray[0];
        String[] framesScoreTextArray = framesScoreText.split("\\|");
        return Arrays.stream(framesScoreTextArray).map(FrameFactory::create).collect(Collectors.toList());
    }

    ExtraBalls parseExtraBalls() {
        if (framesAndExtraBallsArray.length == 1) {
            return null;
        }
        String extraBallsScoreText = framesAndExtraBallsArray[1];
        return new ExtraBalls(extraBallsScoreText);
    }
}