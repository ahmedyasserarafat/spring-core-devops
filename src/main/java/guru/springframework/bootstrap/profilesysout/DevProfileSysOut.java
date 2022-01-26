package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/21/16.
 */
@Component
@Profile("dev")
public class DevProfileSysOut {



    @Autowired
    public DevProfileSysOut(@Value("${guru.springframework.profile.message}") String msg, Environment env) {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("##              DEV             ##");
        System.out.println(msg +"---"+env.getProperty("guru.springframework.profile.message"));
        System.out.println("##################################");
        System.out.println("##################################");
    }
}
