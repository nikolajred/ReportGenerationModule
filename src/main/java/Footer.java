import org.apache.log4j.Logger;

public class Footer {
    String footer;
    private static final Logger log = Logger.getLogger(FirstReport.class);
    public Footer() {

    }

    public Footer(String footer) {
        this.footer = footer;
    }


    public Footer formFooter() {

        log.info("create footer");
        return new Footer();
    }

}
