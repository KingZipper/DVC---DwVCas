package com.example.william.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static TextView text_addFloorName;
    private static TextView text_addDeviceName;
    private static TextView text_addRoomName;
    private static boolean floor1 = false;
    private static boolean floor2 = false;
    private static boolean floor3 = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        baackButton();
        //addFlooor();
    }



/*   public void addFlooor(){
        final Button floorButton = (Button) findViewById(R.id.addFloorButton);
        floorButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(TextView floorName) {
               text_addFloorName.setText(floorButton.getText());

           }
        });*/

  //  }



    public void baackButton(){
        Button backButton = (Button) findViewById(R.id.doneButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }


    });
}
}