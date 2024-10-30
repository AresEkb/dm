package org.example.rdm.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class RdmResourceImpl extends XMIResourceImpl {

    public RdmResourceImpl(URI uri) {
        super(uri);
    }

    @Override
    protected boolean useUUIDs() {
        return true;
    }

}
