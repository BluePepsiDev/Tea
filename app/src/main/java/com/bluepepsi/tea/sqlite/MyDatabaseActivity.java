package com.bluepepsi.tea.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bluepepsi.tea.R;

public class MyDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_database);
        MyDatabaseHelper myDatabaseHelper = new MyDatabaseHelper(this, "pepsi", null, 1);
        SQLiteDatabase sqLiteDatabase = myDatabaseHelper.getWritableDatabase();
        // 插入SQL
//        String sql = "INSERT INTO t_user (_name) VALUES ('tom')";
        // 插入或更新SQL replace into 实际执行的是delete&insert into 导致主键自动增长
//        String sql = "REPLACE INTO t_user (_name) VALUES ('tom')";
        // 插入或更新SQL
        String sql = "INSERT INTO t_user (_name) SELECT 'tom' WHERE NOT EXISTS (SELECT _name FROM t_user WHERE _name='tom')";
        sqLiteDatabase.execSQL(sql);
    }
}
