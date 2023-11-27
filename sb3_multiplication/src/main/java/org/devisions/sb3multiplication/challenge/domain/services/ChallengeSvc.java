package org.devisions.sb3multiplication.challenge.domain.services;

import org.devisions.sb3multiplication.challenge.domain.model.dtos.ChallengeAttemptDTO;
import org.devisions.sb3multiplication.challenge.domain.model.ChallengeAttempt;

public interface ChallengeSvc {

    /**
     * Verifies if an attempt coming from the presentation layer is
     correct or not.
     *
     * @return the resulting ChallengeAttempt object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDto);

}
