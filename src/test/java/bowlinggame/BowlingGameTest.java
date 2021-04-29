package bowlinggame;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BowlingGameTest {
    @Test
    void should_score_300_when_all_frames_are_strike() {
        assertThat(BowlingGame.score("X|X|X|X|X|X|X|X|X|X||XX")).isEqualTo(300);
    }

    @Test
    @Disabled
    void should_score_90_when_all_frames_have_miss() {
        assertThat(BowlingGame.score("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||")).isEqualTo(90);
    }
}
