package org.devisions.sb3multiplication.challenge.domain.services;

import org.devisions.sb3multiplication.challenge.domain.model.dtos.ChallengeAttemptDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeSvcTest {

    private ChallengeSvc challengeSvc;

    @BeforeEach
    public void setup() {
        challengeSvc = new ChallengeSvcImpl();
    }

    @Test
    public void checkCorrectAttemptTest() {
        // Given
        var attemptDto = new ChallengeAttemptDTO(50, 60, "john_doe", 3000);
        // When
        var resultAttempt = challengeSvc.verifyAttempt(attemptDto);
        // Then
        then(resultAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAttemptTest() {
        // Given
        var attemptDto = new ChallengeAttemptDTO(50, 60, "john_doe", 4000);
        // When
        var resultAttempt = challengeSvc.verifyAttempt(attemptDto);
        // Then
        then(resultAttempt.isCorrect()).isFalse();
    }

}
