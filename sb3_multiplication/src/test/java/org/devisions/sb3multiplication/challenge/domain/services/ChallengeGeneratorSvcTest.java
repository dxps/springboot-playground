package org.devisions.sb3multiplication.challenge.domain.services;


import org.devisions.sb3multiplication.challenge.domain.model.Challenge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ChallengeGeneratorSvcTest {

    private ChallengeGeneratorSvc challengeGeneratorSvc;

    @Spy // <-- used to stub an object.
    private Random random;

    @BeforeEach
    public void setup() {
        challengeGeneratorSvc = new ChallengeGeneratorSvcImpl(random);
    }

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() {
        // Given that we generate a max int of 89 (which is max (99) - min (11) range),
        given(random.nextInt(89)).willReturn(20, 30);
        // When we generate a challenge,
        var challenge = challengeGeneratorSvc.randomChallenge();
        // Then the challenge contains factors as expected.
        then(challenge).isEqualTo(new Challenge(31, 41));
    }

}
