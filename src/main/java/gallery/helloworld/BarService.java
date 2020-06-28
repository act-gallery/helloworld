package gallery.helloworld;

import act.controller.annotation.UrlContext;
import act.inject.SessionVariable;
import org.osgl.inject.annotation.Configuration;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.util.S;

@UrlContext("/bar")
public class BarService {

    @GetAction
    public String foo(@SessionVariable String username) {
        return "foo";
    }

}
