package org.devisions.sb3multiplication.challenge.domain.services;

import org.devisions.sb3multiplication.challenge.domain.model.Challenge;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChallengeGeneratorSvcImpl implements ChallengeGeneratorSvc {

    private static final int MIN_FACTOR = 11;
    private static final int MAX_FACTOR = 100;

    private final Random random;

    ChallengeGeneratorSvcImpl() {
        this.random = new Random();
    }

    protected ChallengeGeneratorSvcImpl(final Random random) {
        this.random = random;
    }

    private int next() {
        return random.nextInt(MAX_FACTOR - MIN_FACTOR) + MIN_FACTOR;
    }

    @Override
    public Challenge randomChallenge() {
        return new Challenge(next(), next());
    }

}
