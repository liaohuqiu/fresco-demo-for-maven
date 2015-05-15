package in.srain.demos.fresco;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.logo_image);
        Uri logoUri = Uri.parse("https://raw.githubusercontent.com/liaohuqiu/fresco-docs-cn/docs/static/fresco-logo.png");
        simpleDraweeView.setImageURI(logoUri);

        SimpleDraweeView aniView = (SimpleDraweeView) findViewById(R.id.ani_image);
        Uri aniImageUri = Uri.parse("https://camo.githubusercontent.com/588a2ef2cdcfb6c71e88437df486226dd15605b3/687474703a2f2f737261696e2d6769746875622e71696e6975646e2e636f6d2f756c7472612d7074722f73746f72652d686f7573652d737472696e672d61727261792e676966");
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(aniImageUri)
                .build();

        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setAutoPlayAnimations(true)
                .build();
        aniView.setController(controller);
    }
}
