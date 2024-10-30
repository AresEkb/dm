/*
 * generated by Xtext 2.35.0
 */
package org.example.dm.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.example.dm.xtext.TextualDataModelRuntimeModule;
import org.example.dm.xtext.TextualDataModelStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TextualDataModelIdeSetup extends TextualDataModelStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TextualDataModelRuntimeModule(), new TextualDataModelIdeModule()));
	}
	
}
