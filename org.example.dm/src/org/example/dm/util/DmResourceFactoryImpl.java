package org.example.dm.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class DmResourceFactoryImpl extends ResourceFactoryImpl {

    @Override
    public Resource createResource(URI uri) {
        return new DmResourceImpl(uri);
    }

}
