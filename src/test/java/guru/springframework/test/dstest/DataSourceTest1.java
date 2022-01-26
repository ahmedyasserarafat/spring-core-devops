package guru.springframework.test.dstest;

/**
 * Created by jt on 5/21/16.
 */

import guru.springframework.SpringCoreDevOpsApplication;
import guru.springframework.test.config.DataSourceConfig;
import guru.springframework.test.ds.FakeDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringCoreDevOpsApplication.class)
@WebIntegrationTest
//@ActiveProfiles("dev")
//@ContextConfiguration(classes = {DataSourceConfig.class})

public class DataSourceTest1 {

    private FakeDataSource fakeDataSource;

    @Autowired
    public void setFakeDataSource(FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }

    @Test
    public void TestDataSource() throws Exception {

        System.out.println(fakeDataSource.getConnectionInfo());

    }
}
