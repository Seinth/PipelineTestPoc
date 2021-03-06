import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.*

class TestZero extends BasePipelineTest {

  @Before
  void setup() {
    super.setUp()
  }
 
  @Test
  void should_execute_without_errors() throws Exception {
    def script = loadScript(System.getProperty("tmpSourceDir")+"/Zero.pipeline")
    script.execute()
    printCallStack()
  }
}
