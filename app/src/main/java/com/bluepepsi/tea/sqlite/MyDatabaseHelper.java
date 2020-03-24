package com.bluepepsi.tea.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建表SQL
        // PRIMARY KEY 主键
        // AUTOINCREMENT 自动增长
        // UNIQUE 唯一性约束
        String sql = "CREATE TABLE t_user (_id integer PRIMARY KEY AUTOINCREMENT, _name text UNIQUE)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
