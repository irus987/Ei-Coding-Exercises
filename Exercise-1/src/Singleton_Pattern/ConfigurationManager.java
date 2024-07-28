//Use Case: Configuration Manager
package Singleton_Pattern;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String config;

    private ConfigurationManager() {
        // private constructor to prevent instantiation
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public static void main(String[] args) {
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        configManager1.setConfig("Config1");
        
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        System.out.println(configManager2.getConfig()); // Output: Config1
    }
}

