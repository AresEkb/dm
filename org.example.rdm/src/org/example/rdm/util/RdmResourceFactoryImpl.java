package org.example.rdm.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class RdmResourceFactoryImpl extends ResourceFactoryImpl {

    @Override
    public Resource createResource(URI uri) {
        return new RdmResourceImpl(uri);
    }

}
