package ImageReceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.sanjoo.learnmvvm.R;

public class ImageFromGalleryToMyApp extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_from_gallery_to_my_app);

        imageView=findViewById(R.id.i);
        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();

        if(Intent.ACTION_SEND.equals(action) && type!=null){
            imageView.setImageURI(intent.getParcelableExtra(intent.EXTRA_STREAM));
        }

    }
}