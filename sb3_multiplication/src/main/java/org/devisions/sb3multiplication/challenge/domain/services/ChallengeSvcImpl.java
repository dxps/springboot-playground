package org.devisions.sb3multiplication.challenge.domain.services;

import org.devisions.sb3multiplication.challenge.domain.model.ChallengeAttempt;
import org.devisions.sb3multiplication.challenge.domain.model.dtos.ChallengeAttemptDTO;
import org.devisions.sb3multiplication.user.domain.model.User;

public class ChallengeSvcImpl implements ChallengeSvc {

    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDto) {

        var isCorrect = attemptDto.getGuess() == attemptDto.getFactorA() * attemptDto.getFactorB();
        var user = new User(null, attemptDto.getUserAlias());
        return new ChallengeAttempt(
                null,
                user.getId(),
                attemptDto.getFactorA(),
                attemptDto.getFactorB(),
                attemptDto.getGuess(),
                isCorrect
        );
    }

}
