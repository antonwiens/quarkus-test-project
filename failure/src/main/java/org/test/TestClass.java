package org.test;

import io.quarkus.runtime.Startup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.services.s3.S3Client;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@Startup
public class TestClass {

    @Inject
    public TestClass(S3Client s3Client) {
        LOGGER.info("Hashcode: " + s3Client.hashCode());
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(TestClass.class);
}
