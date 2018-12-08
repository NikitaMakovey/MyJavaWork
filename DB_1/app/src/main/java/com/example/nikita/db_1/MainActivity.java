package com.example.nikita.db_1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ListView listView;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


//    public void onClick (View v) {
//
//        String email = elEmail.getText().toString();
//        String name = elName.getText().toString();
//
//        SQLiteDatabase database = dbHelper.getWritableDatabase();
//
//        ContentValues contentValues = new ContentValues();
//
//        switch (v.getId()) {
//
//            case R.id.button:
//                contentValues.put(DBHelper.KEY_NAME, name);
//                contentValues.put(DBHelper.KEY_MAIL, email);
//
//                database.insert(DBHelper.TABLE_CONTACTS, null, contentValues);
//                break;
//
//            case R.id.button2:
//                Cursor cursor = database.query(DBHelper.TABLE_CONTACTS, null, null, null, null, null, null);
//
//                if (cursor.moveToFirst()) {
//                    int idIndex = cursor.getColumnIndex(DBHelper.KEY_ID);
//                    int nameIndex = cursor.getColumnIndex(DBHelper.KEY_NAME);
//                    int emailIndex = cursor.getColumnIndex(DBHelper.KEY_MAIL);
//                        do {
//                            Log.d("mLog", "ID = " + cursor.getInt(idIndex) +
//                                                        ", name = " + cursor.getString(nameIndex) +
//                                                        ", email = " + cursor.getString(emailIndex));
//                        } while (cursor.moveToNext());
//                } else
//                    Log.d("mLog","0 rows");
//
//                cursor.close();
//                break;
//
//            case R.id.button3:
//                database.delete(DBHelper.TABLE_CONTACTS, null, null);
//                break;
//
//        }
//        dbHelper.close();
//    }
//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }
}
