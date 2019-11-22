import org.apache.log4j.Logger;

public class FirstReport implements IReport {
    Header header;
    Body body;
    Footer footer;

    public FirstReport() {
    }

    public FirstReport(Header header, Body body, Footer footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    private static final Logger log = Logger.getLogger(FirstReport.class);

    public FirstReport formReport() {

        log.info("create report");
        return new FirstReport(header.formHeader(), body.formBody(), footer.formFooter());

    }


}
