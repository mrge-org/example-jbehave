package example.jbehave.tests.stories;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import example.jbehave.tests.AcceptanceTest;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:test-config.xml")

@RunWith(JUnitReportingRunner.class)
//@IncludeEngines("junit-jupiter")
@AcceptanceTest
public class LearnJbehaveStory extends JUnitStories {
    @Override
    protected List<String> storyPaths() {
        final File f = new File(LearnJbehaveStory.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String codeLocation = f.getAbsolutePath()+"\\..\\..\\src\\main\\resources\\example\\jbehave\\tests\\stories\\";
        System.out.println("codeLocation=" + codeLocation);
        return new StoryFinder().findPaths(codeLocation, Arrays.asList("**/*.story"),
                Arrays.asList(""), "file:"+codeLocation);
    }
}
