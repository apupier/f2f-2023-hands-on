// camel-k:
import org.apache.camel.builder.RouteBuilder;

public class CamelRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:demo?synchronous=true")
            .setBody()
              .constant("Hello F2F!")
            .to("log:info")
            .setBody()
              .constant("Bye F2F!")
            .to("log:info");
    }
}
