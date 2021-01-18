package com.example.mycamera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static android.graphics.Bitmap.CompressFormat.PNG;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Button take_photo;
    int flag = 0;
    Bitmap b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.my_image);
        take_photo = (Button) findViewById(R.id.take_photo);

        take_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag == 0) {

                    // -- code for taking photo --

                    Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(i, 99);

                } else if(flag == 1) {

                    //--- code for saving photo ---

                    savePhotoToMySdCard(b);

                    Toast.makeText(getApplicationContext(), "Photo saved to sd card!", Toast.LENGTH_SHORT).show();

                    flag = 0;
                    take_photo.setText("Take Photo");

                }

            }
        });



    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 99 && resultCode == RESULT_OK && data != null){

            b = (Bitmap) data.getExtras().get("data");

            iv.setImageBitmap(b);

            flag = 1;
            take_photo.setText("Save Photo");

        }

    }


    /*private void savePhotoToMySdCard(Bitmap bit){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
        String pname = sdf.format(new Date());


        String root = Environment.getExternalStorageDirectory().toString();
        File folder = new File(root+"/MY_Photos");
        folder.mkdirs();

        File my_file = new File(folder, pname+".png");

        try {

            FileOutputStream stream = new FileOutputStream(my_file);
            bit.compress(Bitmap.CompressFormat.PNG, 80, stream);
            stream.flush();
            stream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/

    private void savePhotoToMySdCard(Bitmap bit){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
        String pname = sdf.format(new Date());

        /*String root = Environment.getExternalStorageDirectory().toString();
        File folder = new File(root + "/SSC_PHOTOS");
        folder.mkdirs();

        File my_file= new File(folder,pname+".png");

        try {

            FileOutputStream stream = new FileOutputStream(my_file);
            bit.compress(Bitmap.CompressFormat.PNG,80,stream);
            stream.flush();
            stream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }*/

        String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root + "/saved_images");
        if (!myDir.exists()) {
            myDir.mkdirs();
        }
        Random generator = new Random();
        int n = 10000;
        n = generator.nextInt(n);
        String fname = "Image-"+ n +".jpg";
        File file = new File (myDir, fname);
        if (file.exists ())
            file.delete ();
        try {
            FileOutputStream out = new FileOutputStream(file);
            bit.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
