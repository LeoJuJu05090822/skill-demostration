import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.junit.*;
import org.junit.Assert.*;
public class SkillDemostrationTester {
    String Name = "Leonard";
    int Age = 20;

    private SkillDemonstration first;

    @Before
    public void setUp(){
        first = new SkillDemonstration(Name, Age);
    }

    @Test
    public void testNameAndAge(){
        asssertEquals("Leonard Shi",first.Student());
    }

}
