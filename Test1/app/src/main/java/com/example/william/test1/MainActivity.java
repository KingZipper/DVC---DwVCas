package com.example.william.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Switch;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity {
    private static SeekBar seekA;
    private static SeekBar seekB;
    private static SeekBar seekC;
    private static SeekBar seekD;
    private static SeekBar seekM;
    private static TextView text_viewA;
    private static TextView text_viewB;
    private static TextView text_viewC;
    private static TextView text_viewD;
    private static TextView text_viewM;


    private App app = new App();
    private ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    Boolean autopilot2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("HEJ", "TJAAAAAAAAAA");
        seekbarrA();
        seekbarrB();
        seekbarrC();
        seekbarrD();
        seekbarrM();
        modeSwitch();
        addButton();


        // Setting up room
        app.setupRoom();

    }


    public void addButton(){
       Button textButton = (Button) findViewById(R.id.addButton);
       textButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, Main2Activity.class));
           }
       });
    }
    public void setAutomatValues(int[]array1){ // ska egentligen ta emot en array
      int []array2;
        array2 = array1;

        seekA.setProgress(array2[0]);
        seekB.setProgress(array2[1]);
        seekC.setProgress(array2[2]);
        seekD.setProgress(array2[3]);

    }
    public void seekbarrM() {
        seekM = (SeekBar) findViewById(R.id.masterSeek);
        text_viewM = (TextView) findViewById(R.id.textViewM);
        text_viewM.setText("Master Sound: " + seekM.getProgress() + " / " + seekM.getMax());


        seekM.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewM.setText("Master Sound: " + progress + " / " + seekM.getMax());
                        //     Toast.makeText(MainActivity.this, "SeekBarA in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in Start Tracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in stopped tracking", Toast.LENGTH_LONG).show();
                        text_viewM.setText("Master Sound: " + progress_value + " / " + seekM.getMax());
                    }

                }
        );

    }
    public void seekbarrA() {
        seekA = (SeekBar) findViewById(R.id.seekBarA);
        text_viewA = (TextView) findViewById(R.id.textViewA);
        text_viewA.setText("Device 1 : " + seekA.getProgress() + " / " + seekA.getMax());


        seekA.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewA.setText("Device 1 : " + progress + " / " + seekA.getMax());
                        //     Toast.makeText(MainActivity.this, "SeekBarA in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in Start Tracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in stopped tracking", Toast.LENGTH_LONG).show();
                        text_viewA.setText("Device 1 : " + progress_value + " / " + seekA.getMax());
                    }

                }
        );

    }
    public void seekbarrB() {
        seekB = (SeekBar)findViewById(R.id.seekBarB);
        text_viewB = (TextView) findViewById(R.id.textViewB);
        text_viewB.setText("Device 2 : " + seekB.getProgress() + " / " + seekB.getMax());


        seekB.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;
                    @Override
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser){
                        progress_value = progress;
                        text_viewB.setText("Device 2 : " + progress + " / " + seekB.getMax());
                        //     Toast.makeText(MainActivity.this, "SeekBarA in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch (SeekBar seekBar){

                        //     Toast.makeText(MainActivity.this, "SeekBarA in Start Tracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch (SeekBar seekBar){

                        //     Toast.makeText(MainActivity.this, "SeekBarA in stopped tracking", Toast.LENGTH_LONG).show();
                        text_viewB.setText("Device 2 : " + progress_value + " / " + seekB.getMax());
                    }

                }
        );


    }
    public void seekbarrC() {
        seekC = (SeekBar) findViewById(R.id.seekBarC);
        text_viewC = (TextView) findViewById(R.id.textViewC);
        text_viewC.setText("Device 3 : " + seekC.getProgress() + " / " + seekC.getMax());


        seekC.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewC.setText("Device 3 : " + progress + " / " + seekC.getMax());
                        //     Toast.makeText(MainActivity.this, "SeekBarA in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in Start Tracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in stopped tracking", Toast.LENGTH_LONG).show();
                        text_viewC.setText("Device 3 : " + progress_value + " / " + seekC.getMax());
                    }

                }
        );

    }
    public void seekbarrD() {
        seekD = (SeekBar) findViewById(R.id.seekBarD);
        text_viewD = (TextView) findViewById(R.id.textViewD);
        text_viewD.setText("Device 4 : " + seekD.getProgress() + " / " + seekD.getMax());


        seekD.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                        progress_value = progress;
                        text_viewD.setText("Device 4 : " + progress + " / " + seekD.getMax());
                        //     Toast.makeText(MainActivity.this, "SeekBarA in progress", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in Start Tracking", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                        //     Toast.makeText(MainActivity.this, "SeekBarA in stopped tracking", Toast.LENGTH_LONG).show();
                        text_viewD.setText("Device 4 : " + progress_value + " / " + seekD.getMax());
                    }

                }
        );

    }

    public void createAutoVal(int [] array1){
      int []array2;
       array2 = array1;

        Log.e("","HELLO3");
        Runnable helloRunnable = new Runnable() {
            public void run() {
                if(autopilot2){
                    Log.e("","HELLO4");
                    setAutomatValues();

                    //    dh.pingSpeaker(device);
                }
            }
        };
        executor.scheduleAtFixedRate(helloRunnable, 0, 2, TimeUnit.SECONDS);
    }

    public void modeSwitch() {
        Switch switch_button = (Switch) findViewById(R.id.ModeSwitch);



        Log.e("HEJ", "HELLO1");

        switch_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
        // while is checked ping beacon every half second
                    Log.e("HEJ", "HELLO2");
                   autopilot2 = true;
                    createAutoVal(app.sendAutoProgress());
                  //  app.startTimer();

                             // ska egentligen passa med en array




                    Toast.makeText(getApplicationContext(), "Switch is on", Toast.LENGTH_LONG).show();
                    Log.e("HEJ", "TJCCCCCCCC");
                }
                else if (!isChecked){
                    autopilot2 = false;

                    Toast.makeText(getApplicationContext(), "Switch is off", Toast.LENGTH_LONG).show();
                }
                app.toggleAutopilot(app.getAutoPilot());
            }
        });
    }






}
