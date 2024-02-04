package com.example.myauaf;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class app_db extends SQLiteOpenHelper {

    Context mcontext;
    String dbName;
    String dbPath;
    public static String db_name ="accounts.db";
    public static String table_name ="records";
    public static String col1 ="name";
    public static String col2 ="email";
    public static String col3 ="ID";
    public static String col4 ="password";

    public app_db(Context context, String name, int version) {
        super(context, name, null, version);
        this.dbName = name;
        this.mcontext= context;
        this.dbPath = "data/data" + "com.example.myauaf" + "databases";

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_table = "CREATE TABLE records (ID PRIMARY KEY, name TEXT, email TEXT, password TEXT)"; //creates the table with the mentioned columns
        db.execSQL(create_table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS record");
       onCreate(db);

    }
    public void checkdb() {
        SQLiteDatabase checkdb = null;
        String filePath = dbPath + dbName;
        try {
            checkdb = SQLiteDatabase.openDatabase(filePath,null,0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (checkdb != null){

            Toast.makeText(mcontext, "Database already exist", Toast.LENGTH_SHORT).show();;
        } else {

            CopyDatabase();
        }
    }
    public void CopyDatabase(){

        this.getReadableDatabase();
        try{

            InputStream ios  = mcontext.getAssets().open(dbName);
            OutputStream os = new FileOutputStream(dbPath +dbName);
            byte[] buffer = new byte[1024];
            int len;
            while((len = ios.read(buffer))> 0){
                os.write(buffer,0,len);

            }
            os.flush();
            ios.close();
            os.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("CopDb","Database Copied");

    }
    public void Opendatabse(){
        String filePath = dbPath+dbName;
        SQLiteDatabase.openDatabase(filePath,null,0);


    }

       /* SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(col1,name);
        values.put(col2,email);
        values.put(col3,ID);
        values.put(col4,password);

        long res = db.insert(table_name, null, values);
        if (res == -1){

            return 0;
        }
        else{
            return 1;
        } */




}



