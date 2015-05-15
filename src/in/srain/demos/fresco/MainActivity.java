package in.srain.demos.fresco;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.logo_image);
        Uri logoUri = Uri.parse("https://raw.githubusercontent.com/liaohuqiu/fresco-docs-cn/docs/static/fresco-logo.png");
        simpleDraweeView.setImageURI(logoUri);
    }
}
