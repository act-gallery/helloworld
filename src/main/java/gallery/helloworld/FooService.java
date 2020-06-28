package gallery.helloworld;

import act.controller.annotation.UrlContext;
import act.inject.SessionVariable;
import org.osgl.mvc.annotation.GetAction;

@UrlContext("/foo")
public class FooService {

    @SessionVariable
    private String username;

    @GetAction
    public void foo() {
    }

}
