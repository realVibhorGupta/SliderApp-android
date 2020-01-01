package in.vibhorgupta.www.sliderappdemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by vibh on 12-10-2016.
 */

public class PreferenceManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context  _context;


   int PRIVATE_MODE = 0 ;
    private static final String PREF_NAME = "vibhor-welcome";
    public static final String IS_FIRST_TIME_LAUNCH = "is first time launch" ;

    public PreferenceManager(Context context) {
        this._context = context;
        sharedPreferences = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return sharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }




}
