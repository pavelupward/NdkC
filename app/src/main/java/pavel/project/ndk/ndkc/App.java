package pavel.project.ndk.ndkc;

import android.app.Application;

/**
 * Created by pavel on 27.01.2018.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

}
