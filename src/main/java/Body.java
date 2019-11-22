import org.apache.log4j.Logger;

public class Body {
    String body;
    private static final Logger log = Logger.getLogger(FirstReport.class);
    public Body() {
    }

    public Body(String body) {
        this.body = body;
    }
    public Body formBody(){
        log.info("create body");
        return new Body();
    }
}
