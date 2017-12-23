package mx.com.thenewtime.e_bitwaretest.utils;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by isai.castro on diez/23/2017.
 */

public class MediaManager {

    private static final String JPEG_FILE_SUFFIX = ".png";
    private static final String FILE_3GP_SUFFIX = ".3gp";


    public static File createImageFile(Context activity) throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  /* prefix */
                JPEG_FILE_SUFFIX,         /* suffix */
                storageDir      /* directory */
        );
        // Save a file: path for use with ACTION_VIEW intents
        return image;
    }

    public static File createAudioFile(Context activity) throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String audioFileName = "AU_" + timeStamp + "_";
        File storageDir = activity.getExternalFilesDir(Environment.DIRECTORY_RINGTONES);
        File audio = File.createTempFile(
                audioFileName,  /* prefix */
                FILE_3GP_SUFFIX,         /* suffix */
                storageDir      /* directory */
        );
        // Save a file: path for use with ACTION_VIEW intents
        return audio;
    }

}
