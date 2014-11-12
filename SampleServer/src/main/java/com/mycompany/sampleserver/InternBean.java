/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sampleserver;

import com.mycompany.sampleejbmodule.ExternBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author pascal.perau
 */
@Stateless
public class InternBean {
    
    @Inject
    private ExternBean b;
    
    public String callExtern() {
        return b.businessMethod();
    }
    
}
