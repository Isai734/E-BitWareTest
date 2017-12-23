package mx.com.thenewtime.e_bitwaretest.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by isai.castro on 12/9/2017.
 */

public class Utils {
    public static String getVersionName(Context context) {
        try {
            PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return "v" + pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return context.getString(android.R.string.unknownName);
        }
    }
}
