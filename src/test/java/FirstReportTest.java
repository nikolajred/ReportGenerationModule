import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstReportTest {

    @Test
    public void formReport() {
        FirstReport firstReport = new FirstReport();
        FirstReport actual = firstReport.formReport();
        FirstReport expected = null;
        Assert.assertEquals(actual, expected);
    }
}