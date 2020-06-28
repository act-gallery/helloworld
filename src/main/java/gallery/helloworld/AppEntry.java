package gallery.helloworld;

/*-
 * #%L
 * actframework app demo - hello world
 * %%
 * Copyright (C) 2018 ActFramework
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import act.Act;
import act.controller.Controller;
import act.inject.DefaultValue;
import act.util.AdaptiveBean;
import act.util.AdaptiveBeanBase;
import act.util.Output;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;
import org.osgl.util.C;

import java.util.List;

/**
 * The simple hello world app.
 *
 * Run this app, try to update some of the code, then
 * press F5 in the browser to watch the immediate change
 * in the browser!
 */
@SuppressWarnings("unused")
public class AppEntry extends Controller.Util {

    /**
     * Home page - display `Hello ${who}` in the page
     *
     * @param who
     *      A URL path parameter specify who to say `Hello`.
     *      Default value is `World`
     */
    @GetAction("{who}")
    public void home(@DefaultValue("World") @Output String who) {
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
