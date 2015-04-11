package com.cxyliuyu.cyjszs.SQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class NotificationSqliteOpenHelper extends SQLiteOpenHelper{

	public NotificationSqliteOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO 自动生成的方法存根
		//创建notification（通知）表
		//Log.i("notification","创建表");
		arg0.execSQL("CREATE TABLE IF NOT EXISTS notification"+" (id INTEGER,text varchar,url varchar)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO 自动生成的方法存根
		
	}

}
