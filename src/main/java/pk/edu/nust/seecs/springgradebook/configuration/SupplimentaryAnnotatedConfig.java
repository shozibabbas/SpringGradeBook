
package pk.edu.nust.seecs.springgradebook.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pk.edu.nust.seecs.springgradebook.bo.CourseBo;
import pk.edu.nust.seecs.springgradebook.bo.CourseBoImpl;
import pk.edu.nust.seecs.springgradebook.bo.StudentBo;
import pk.edu.nust.seecs.springgradebook.bo.StudentBoImpl;

@Configuration
@ComponentScan(basePackages={"pk.edu.nust.seecs.springgradebook"})
public class SupplimentaryAnnotatedConfig {

    @Bean
    public CourseBo courseManager() {
        return new CourseBoImpl();
    }
    
    @Bean
    public StudentBo studentManager() {
        return new StudentBoImpl();
    }
    
}
