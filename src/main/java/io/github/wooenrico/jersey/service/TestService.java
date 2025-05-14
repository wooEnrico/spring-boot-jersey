package io.github.wooenrico.jersey.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Value("${jersey.test.message: from TestService}")
    private String message;

    public String getMessage() {
        return message;
    }

}
