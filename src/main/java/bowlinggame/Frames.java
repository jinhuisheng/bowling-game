package bowlinggame;

import java.util.List;

public class Frames {
    private static final int EIGHTH_FRAME_INDEX = 8;
    private static final int FRAME_COUNT = 10;
    private final List<Frame> parseFrames;
    private final ExtraBalls parseExtraBalls;

    public Frames(List<Frame> parseFrames, ExtraBalls parseExtraBalls) {
        this.parseFrames = parseFrames;
        this.parseExtraBalls = parseExtraBalls;
    }

    public Integer score() {
        int score = 0;
        for (int index = 0; index < FRAME_COUNT; index++) {
            score += countFrameScore(index);
        }
        return score;
    }

    int countFrameScore(int index) {
        Frame currentFrame = parseFrames.get(index);
        if (currentFrame.isStrike()) {
            return currentFrame.getBowlingPins() + getNextPinFall(index) + getNextNextPinFall(index);
        }
        if (currentFrame.isSpare()) {
            return currentFrame.getBowlingPins() + getNextPinFall(index);
        }
        return currentFrame.getBowlingPins();
    }

    private int getNextNextPinFall(int index) {
        if (index < EIGHTH_FRAME_INDEX) {
            return parseFrames.get(index + 1).isStrike() ? parseFrames.get(index + 2).getFirstPinFall() : parseFrames.get(index + 1).getSecondPinFall();
        }
        if (index == EIGHTH_FRAME_INDEX) {
            return parseExtraBalls.getFirstPinFall();
        }
        return parseExtraBalls.getSecondPinFall();
    }

    private int getNextPinFall(int index) {
        if (index <= EIGHTH_FRAME_INDEX) {
            return parseFrames.get(index + 1).getFirstPinFall();
        }
        return parseExtraBalls.getFirstPinFall();
    }
}