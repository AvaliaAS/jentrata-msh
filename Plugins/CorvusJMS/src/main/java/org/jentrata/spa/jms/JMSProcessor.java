/**
 * 
 */
package org.jentrata.spa.jms;


import org.jentrata.spa.jms.module.JMSComponent;

import hk.hku.cecid.piazza.commons.Sys;
import hk.hku.cecid.piazza.commons.module.ModuleException;
import hk.hku.cecid.piazza.commons.module.ModuleGroup;
import hk.hku.cecid.piazza.commons.module.SystemModule;
import hk.hku.cecid.piazza.commons.spa.Plugin;
import hk.hku.cecid.piazza.commons.spa.PluginException;
import hk.hku.cecid.piazza.commons.spa.PluginHandler;

/**
 * @author aaronwalker
 *
 */
public class JMSProcessor implements PluginHandler {
    
    public static final String PLUGIN_ID = "org.jentrata.jms";
    public static final String JMS_COMP_ID = "jms";
    

    private static ModuleGroup moduleGroup;
    
    public static SystemModule core;
    
    private static JMSProcessor processor;
 
    public static JMSProcessor getInstance() {
        if (processor == null)
            throw new ModuleException("JMSProcessor not initialized");
        
        return processor;
    }
    
    public void processActivation(Plugin plugin) throws PluginException {
        Sys.main.log.debug("JMSProcessor activation");
        processor = this;
        
        String mgDescriptor = plugin.getParameters().getProperty("module-group-descriptor");
        moduleGroup = new ModuleGroup(mgDescriptor, plugin.getClassLoader());
        Sys.getModuleGroup().addChild(moduleGroup);
        
        core = moduleGroup.getSystemModule();
        moduleGroup.startActiveModules();
        
        if (core == null) {
            throw new PluginException("JMS system module not found");
        }
    }
    
    public void processDeactivation(Plugin plugin) throws PluginException {
        moduleGroup.stopActiveModules();
    }
    
    public JMSComponent getJmsComponent() {
        return (JMSComponent) core.getComponent(JMS_COMP_ID);
    }
}
