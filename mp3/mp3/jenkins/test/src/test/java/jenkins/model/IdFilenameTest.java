package jenkins.model;

import hudson.DescriptorExtensionList;
import hudson.Extension;
import hudson.ExtensionPoint;
import hudson.model.AbstractDescribableImpl;
import hudson.util.CaseInsensitiveComparator;
import org.apache.commons.lang.StringUtils;
import org.kohsuke.stapler.DataBoundConstructor;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import javax.annotation.Nonnull;
import java.util.Comparator;
import java.util.Locale;

public class IdFilenameTest {

    public IdStrategy.CaseSensitive id = new IdStrategy.CaseSensitive();

    @Test
    public void testBlingFirst() {
        String testFileName = "$45,000";
        String finalFileName = id.idFromFilename(testFileName);
        assertEquals(finalFileName, "45000");
    }

    @Test
    public void testBlingAfter() {
        String testName = "test-$";
        String finalFileName = id.idFromFilename(testName);
        assertEquals(finalFileName, "test-");
    }
}