package soexample.umeng.com.newfresco;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.DraweeConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Uri uri = Uri.parse("https://img01.sogoucdn.com/net/a/04/link?appid=100520145&url=https%3A%2F%2Fimg03.sogoucdn.com%2Fapp%2Fa%2F100520093%2F0e0fd862f51611ae-70061ff5f96548be-911366d3272119c455bdb8c98dae50ae.jpg");
    Uri mUri=Uri.parse("https://img.zcool.cn/community/01bec7599ab638a801215603022692.gif");
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private SimpleDraweeView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }


    private void initView() {
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        icon = (SimpleDraweeView) findViewById(R.id.icon);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but1:
                icon.setImageURI(uri);
                RoundingParams roundingParams1= RoundingParams.fromCornersRadius(40f);
                roundingParams1.setOverlayColor(Color.GREEN);
                icon.getHierarchy().setRoundingParams(roundingParams1);
                break;
            case R.id.but2:
                icon.setImageURI(uri);
                RoundingParams roundingParams2=RoundingParams.fromCornersRadius(50f);
                roundingParams2.setRoundAsCircle(true);
                roundingParams2.setBorder(Color.BLUE,1);
                roundingParams2.setOverlayColor(Color.WHITE);
                roundingParams2.setCornersRadius(30f);
                icon.getHierarchy().setRoundingParams(roundingParams2);
                break;
            case R.id.but3:
                icon.setImageURI(uri);
                break;
            case R.id.but4:
                ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
                        .setProgressiveRenderingEnabled(true)
                        .build();
                DraweeController controller1 = Fresco.newDraweeControllerBuilder()
                        .setImageRequest(request)
                        .setOldController(icon.getController())
                        .build();
                icon.setController(controller1);
                break;
            case R.id.but5:

                break;
            case R.id.but6:
                DraweeController controller = Fresco.newDraweeControllerBuilder()
                        .setUri(mUri)
                        .setAutoPlayAnimations(true)
                        .build();
                icon.setController(controller);
                break;
            case R.id.but7:

                break;
            case R.id.but8:

                break;
        }
    }
}
