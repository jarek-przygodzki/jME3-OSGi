package jme3_test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;
	
	HelloJME3 app = new HelloJME3();

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		app.start();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		app.stop();
	}

}
