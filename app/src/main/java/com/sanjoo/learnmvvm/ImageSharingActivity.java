package com.sanjoo.learnmvvm;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.sanjoo.learnmvvm.databinding.ActivityImageShairingBinding;

import java.util.ArrayList;

public class ImageSharingActivity extends AppCompatActivity {



    private ActivityImageShairingBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_image_shairing);
        //setContentView(R.layout.activity_image_shairing);
        getImageUri();

        //testing for passing the data
//        Bundle bundle=getIntent().getExtras();
//        String email=bundle.getString("email");
//        String name=bundle.getString("name");
//        String numbwr=bundle.getString("no");
//
//        Toast.makeText(this,email+", "+name+", "+numbwr,Toast.LENGTH_SHORT).show();


        //testing to open a web



        binding.shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent=new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_STREAM,getUriFromImageviewViaBitmap());
                shareIntent.setType("image/jpeg");
                startActivity(Intent.createChooser(shareIntent,"share image"));
            }
        });
        binding.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent=new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,"this is msg");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent,null));
            }
        });

    }
   private void handleSendImage(Intent intent){
        Uri imageUri=intent.getParcelableExtra(Intent.EXTRA_STREAM);

       binding.setNewImage.setImageURI(imageUri);
    }

    void handleSendMultipleImages(Intent intent) {
        ArrayList<Uri> imageUris = intent.getParcelableArrayListExtra(Intent.EXTRA_STREAM);
        if (imageUris != null) {
            // Update UI to reflect multiple images being shared
        }
    }
    private Uri getUriFromImageviewViaBitmap(){
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.pic);
        String bitmapPath = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap,"Image Sharing", null);
        return Uri.parse(bitmapPath);
    }

    private void getImageUri(){
        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();
        if(Intent.ACTION_SEND.equals(action)&&type !=null){
            type.startsWith("image/");
            handleSendImage(intent);
        } else if (Intent.ACTION_SEND_MULTIPLE.equals(action)&&type !=null) {
            type.startsWith("image/");
            handleSendMultipleImages(intent);
        }
    }
}




















