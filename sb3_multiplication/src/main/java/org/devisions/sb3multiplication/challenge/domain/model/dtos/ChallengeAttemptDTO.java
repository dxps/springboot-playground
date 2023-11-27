package org.devisions.sb3multiplication.challenge.domain.model.dtos;

import lombok.Value;

/** An attempt coming from the user. */
@Value
public class ChallengeAttemptDTO {

    int factorA;
    int factorB;
    String userAlias;
    int guess;

}
