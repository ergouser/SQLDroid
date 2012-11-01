/*
 * Created on May 9, 2012
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package android.util;

import org.apache.log4j.Logger;

public class Log {

  public static int i(String string, String sql) {
    Logger.getLogger(Log.class).info(string + ":" + sql);
    return 1;
  }

  public static int v(String string, String sql) {
    Logger.getLogger(Log.class).debug(string + ":" + sql);    
    return 1;
  }

  public static int e(String string, String sql) {
    Logger.getLogger(Log.class).error(string + ":" + sql);    
    return 1;
  }

  public static int d(String string, String sql) {
    Logger.getLogger(Log.class).debug(string + ":" + sql);    
    return 1;
  }

  public static int e(String string, String string2, Exception e) {
    Logger.getLogger(Log.class).error(string + ":" + string2, e);
    return 1;
  }

}
