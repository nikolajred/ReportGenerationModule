import org.apache.log4j.Logger;

public class Header {
    String header;
    private static final Logger log = Logger.getLogger(FirstReport.class);
    public Header() {
    }

    public Header(String header) {
        this.header = header;
    }
    public Header formHeader(){
        log.info("create header");
        return new Header();
    }
}
