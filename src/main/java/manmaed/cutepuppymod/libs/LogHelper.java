package manmaed.cutepuppymod.libs;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

/**
 * Created by manmaed on 27/09/2016.
 */
public class LogHelper {

    private static void log(Level logLevel, Object object)
    {
        LogManager.getLogger(Reference.MOD_ID).log(logLevel, "["+ Reference.MOD_ID + "]:[" + logLevel + "]:" + String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}
