/*
 * Created on Nov 1, 2012
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package android.database.sqlite;

import android.database.Cursor;

public interface SQLiteCursorDriver {
  public abstract void  cursorClosed();
  public abstract void  cursorDeactivated();
  public abstract void  cursorRequeried(Cursor cursor);
  public abstract Cursor  query(SQLiteDatabase.CursorFactory factory, String[] bindArgs);
  public abstract void  setBindArguments(String[] bindArgs);
}
