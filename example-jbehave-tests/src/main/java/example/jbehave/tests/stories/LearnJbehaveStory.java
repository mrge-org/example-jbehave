package example.jbehave.tests.stories;

import example.jbehave.tests.AcceptanceTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:test-config.xml")
@AcceptanceTest
public class LearnJbehaveStory extends AbstractSpringJBehaveStory {
}
