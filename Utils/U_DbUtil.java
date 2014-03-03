package cn.redonly.trainman4ios.testutil;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class U_DbUtil {

	/**
	 * 关闭cursor
	 * 
	 * @param cursor
	 */
	public static void closeCursor(Cursor cursor) {
		if (cursor != null && !cursor.isClosed()) {
			cursor.close();
		}
	}
	/**
	 * 关闭db
	 * @param db
	 */
	public static void closeDb(SQLiteDatabase db){
		if(db != null && db.isOpen()){
			db.close();
		}
	}
	
}
