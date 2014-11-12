package com.mycompany.sampleejbmodule;

import javax.ejb.Stateless;

/**
 *
 * @author martin
 */
@Stateless
public class ExternBean {

    public String businessMethod() {
        return "I'm called";
    }

}
