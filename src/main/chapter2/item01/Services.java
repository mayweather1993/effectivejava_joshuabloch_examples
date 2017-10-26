package main.chapter2.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    public Services() {
    }

    //maps services names to services
    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //provider registration API
    public static void registerDefaultProvider(Provider provider) {

    }

    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    //service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name " + name);
        }
        return p.newService();
    }
}

