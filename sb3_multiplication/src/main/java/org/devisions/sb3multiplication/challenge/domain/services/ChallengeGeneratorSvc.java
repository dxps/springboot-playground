package org.devisions.sb3multiplication.challenge.domain.services;

import org.devisions.sb3multiplication.challenge.domain.model.Challenge;

public interface ChallengeGeneratorSvc {

    /** @return A randomly generated challenge with factors between 11 and 99. */
    Challenge randomChallenge();

}
