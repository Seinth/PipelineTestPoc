import static com.lesfurets.jenkins.unit.global.lib.LibraryConfiguration.library

import com.lesfurets.jenkins.unit.BasePipelineTest
//import com.lesfurets.jenkins.unit.global.lib.GitSource
import com.lesfurets.jenkins.unit.global.lib.LocalSource

import org.junit.*

class TestFirst extends BasePipelineTest {

  @Before
  void setup() {
    super.setUp()
    
    String clonePath = 'SharedLibraryDummy'

    def library = library()
                    .name('Dummy')
//                    .retriever(GitSource.gitSource('https://github.com/Seinth/PipelineSharedLibraryPoc.git'))
                    .retriever(LocalSource.localSource('./PipelineSharedLibraryPoc'))
                    .targetPath(clonePath)
                    .defaultVersion("master")
                    .allowOverride(true)
                    .implicit(false)
                    .build()
    helper.registerSharedLibrary(library)
  }
 
  @Test
  void should_execute_without_errors() throws Exception {
    def script = loadScript("src/main/tmpgroovy/First.pipeline")
    script.execute()
    printCallStack()
  }
}
