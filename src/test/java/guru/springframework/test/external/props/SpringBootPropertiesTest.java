package guru.springframework.test.external.props;

import guru.springframework.SpringCoreDevOpsApplication;
import guru.springframework.test.jms.FakeJmsBroker;
import guru.test.config.external.props.ExternalPropsEnvironment;
import guru.test.config.external.props.ExternalPropsMultiFileS4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringCoreDevOpsApplication.class)
@WebIntegrationTest
@TestPropertySource("/application.properties")
//@ContextConfiguration(classes = ExternalPropsMultiFileS4.class)
public class SpringBootPropertiesTest {
    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropsSet() throws Exception {
        assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        assertEquals(3330, fakeJmsBroker.getPort().intValue());
        assertEquals("Ron", fakeJmsBroker.getUser());
        //assertEquals("&%$)(*&#^!@!@#$", fakeJmsBroker.getPassword());
       assertEquals("Burgundy", fakeJmsBroker.getPassword());
    }

}
