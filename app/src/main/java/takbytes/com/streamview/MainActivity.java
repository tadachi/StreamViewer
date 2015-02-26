package takbytes.com.streamview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import org.xwalk.core.XWalkView;

public class MainActivity extends Activity {
    public final String TAG = "MainActivity";
    private Context context;

    private XWalkView xWalkWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this.getBaseContext();

        xWalkWebView=(XWalkView)findViewById(R.id.xwalkWebView);
        xWalkWebView.load("https://crosswalk-project.org", null);
    }
}
