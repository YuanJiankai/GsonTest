package Log;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTest {
    private static Logger logger = LoggerFactory.getLogger(SimpleTest.class);

    @Test
    public void test1() {
        logger.info("message is {}", "ok");
        logger.debug("message is {}", "ok");
        logger.warn("message is {}", "ok");
        logger.error("message is {}", "ok");
    }
}
