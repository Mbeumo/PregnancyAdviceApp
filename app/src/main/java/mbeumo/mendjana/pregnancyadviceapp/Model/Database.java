package mbeumo.mendjana.pregnancyadviceapp.Model;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
private static final String DATABASE_NAME = "APP_db";
private static final String TABLE_NAME = "Users";
private static final String COL_ID = "id";
private static final String COL_NAME = "name";
private static final String COL_AGE = "age";
private static final String COL_ADDRESS = "address";
private static final String COL_PASSWORD = "password";

public Database(Context context) {
        super(context, DATABASE_NAME, null, 1);
        }

@Override
public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " (" +
        COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
        COL_NAME + " TEXT NOT NULL, "  +
        COL_AGE + " INTEGER check ("+COL_AGE+">=16), " +
        COL_ADDRESS + " TEXT, " +
        COL_PASSWORD + " TEXT NOT NULL)";
        db.execSQL(createTableQuery);
        }

@Override
public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
        }

public boolean insertUserData(String name, int age, String address, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NAME, name);
        contentValues.put(COL_AGE, age);
        contentValues.put(COL_ADDRESS, address);
        contentValues.put(COL_PASSWORD, password);

        long result = db.insert(TABLE_NAME, null, contentValues);
        return result != -1;
        }

public boolean verifyUserCredentials(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = {COL_ID};
        String selection = COL_NAME + " = ? AND " + COL_PASSWORD + " = ?";
        String[] selectionArgs = {username, password};

        Cursor cursor = db.query(TABLE_NAME, columns, selection, selectionArgs, null, null, null);
        boolean isValid = cursor.moveToFirst();
        cursor.close();
        return isValid;
        }
        }

