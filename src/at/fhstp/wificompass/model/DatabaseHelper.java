/*
 * Created on Dec 21, 2011
 * Author: Paul Woelfel
 * Email: frig@frig.at
 */
package at.fhstp.wificompass.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

	// name of the database file for your application -- change to something appropriate for your app
	private static final String DATABASE_NAME = "wificompass.db";

	// any time you make changes to your database objects, you may have to increase the database version
	private static final int DATABASE_VERSION = 1;

	public DatabaseHelper(Context context) {
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
		// to speed up, we could use a config file
		// must be generated by ormlite.sh or
		// java -classpath lib/ormlite-core-4.31.jar:lib/ormlite-android-4.31.jar:bin/res:bin/classes com.j256.ormlite.android.apptools.OrmLiteConfigUtil ormlite_config.txt
//		super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
	}

	@Override
	public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
	}

	@Override
	public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
	}

}
