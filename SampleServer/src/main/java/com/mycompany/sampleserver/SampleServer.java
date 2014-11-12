package com.mycompany.sampleserver;

import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.naming.NamingException;

/**
 *
 * @author pascal.perau
 */
public class SampleServer {

    EJBContainer container;

    @Inject
    private InternBean sessionBean;

    public SampleServer() {
    }

    public void run() {
        container = EJBContainer.createEJBContainer();
        try {
            container.getContext().bind("inject", this);
        } catch (NamingException ex) {
            throw new RuntimeException(ex);
        }
        // inject
        sessionBean.callExtern();

    }

    public String call() {
        return sessionBean.callExtern();
    }

}
