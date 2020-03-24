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
        String sql = "REPLACE INTO t_user (_name) VALUES ('tom')";
        sqLiteDatabase.execSQL(sql);
    }
}
