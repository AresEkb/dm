/*
 * generated by Xtext 2.35.0
 */
package org.example.dm.xtext;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without Equinox extension
 * registry.
 */
public class TextualDataModelStandaloneSetup extends TextualDataModelStandaloneSetupGenerated {

    public static void doSetup() {
        new TextualDataModelStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    public static void doSetup(ResourceSet resourceSet) {
        new TextualDataModelStandaloneSetup().createInjectorAndDoEMFRegistration(resourceSet);
    }

    public Injector createInjectorAndDoEMFRegistration(ResourceSet resourceSet) {
        createTerminalsInjectorAndDoEMFRegistration(resourceSet);

        Injector injector = createInjector();
        register(injector, resourceSet);
        return injector;
    }

    public void register(Injector injector, ResourceSet resourceSet) {
        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
        IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("tdm", resourceFactory);
        IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("tdm", serviceProvider);
    }

    private void createTerminalsInjectorAndDoEMFRegistration(ResourceSet resourceSet) {
        // register default ePackages
        if (!resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("ecore")) {
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                    "ecore", new EcoreResourceFactoryImpl());
        }
        if (!resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("xmi")) {
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                    "xmi", new XMIResourceFactoryImpl());
        }
        if (!resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().containsKey("xtextbin")) {
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                    "xtextbin", new BinaryGrammarResourceFactoryImpl());
        }
        if (!resourceSet.getPackageRegistry().containsKey(XtextPackage.eNS_URI)) {
            resourceSet.getPackageRegistry().put(XtextPackage.eNS_URI, XtextPackage.eINSTANCE);
        }
    }

}
