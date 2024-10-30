package org.example.dm.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class DmResourceImpl extends XMIResourceImpl {

    public DmResourceImpl(URI uri) {
        super(uri);
    }

    @Override
    protected boolean useUUIDs() {
        return true;
    }

}
