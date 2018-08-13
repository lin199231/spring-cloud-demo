package com.fantablade.gateway.test;

import com.fantablade.gateway.GatewayApp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GatewayApp.class)
//@ActiveProfiles(profiles = "dev")
public class BaseTest extends Assert {
    @Test
    public void base() {
        assertTrue(true);
    }
}
