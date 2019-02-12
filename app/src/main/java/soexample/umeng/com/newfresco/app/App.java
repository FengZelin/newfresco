package soexample.umeng.com.newfresco.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * date:2019/2/12
 * author:冯泽林(asus)
 * function:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
