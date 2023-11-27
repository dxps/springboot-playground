package org.devisions.sb3multiplication.challenge.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.devisions.sb3multiplication.challenge.domain.model.Challenge;
import org.devisions.sb3multiplication.challenge.domain.services.ChallengeGeneratorSvc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    private final ChallengeGeneratorSvc challengeGeneratorSvc;

    @GetMapping("/random")
    Challenge getRandomChallenge() {
        var challenge = challengeGeneratorSvc.randomChallenge();
        log.info("Generating a random challenge: {}", challenge);
        return challenge;
    }

}
