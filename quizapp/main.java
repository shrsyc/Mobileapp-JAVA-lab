package com.example.gan5;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 RadioButton rb1,rb2,rb3,rb4,rb5,rb6;
 ImageView img,img1;
 int cnt;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 rb1=(RadioButton) findViewById(R.id.radioButton);
 rb2=(RadioButton) findViewById(R.id.radioButton2);
 rb3=(RadioButton) findViewById(R.id.radioButton3);
rb4=(RadioButton) findViewById(R.id.radioButton4);
 rb5=(RadioButton) findViewById(R.id.radioButton5);
 rb6=(RadioButton) findViewById(R.id.radioButton6);
 img=(ImageView)findViewById(R.id.imageView);
 img1=(ImageView)findViewById(R.id.imageView2);
 rb1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 img.setVisibility(View.VISIBLE);
 img.setImageResource(R.drawable.wrong);
 }
 });
 rb2.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 img.setVisibility(View.VISIBLE);
 img.setImageResource(R.drawable.wrong);
 }
 });
 rb3.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 img.setVisibility(View.VISIBLE);
 img.setImageResource(R.drawable.right);
 cnt=cnt+1;
 }
 });
 rb4.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 img1.setVisibility(View.VISIBLE);
 img1.setImageResource(R.drawable.wrong);
 }
 });
 rb5.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 img1.setVisibility(View.VISIBLE);
 img1.setImageResource(R.drawable.right);
 cnt=cnt+1;
 }
 });
 rb6.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 img1.setVisibility(View.VISIBLE);
 img1.setImageResource(R.drawable.wrong);
 }
 });
 Button b1=(Button) findViewById(R.id.button2);
 b1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Toast.makeText(getApplicationContext(),
 String.valueOf(cnt),Toast.LENGTH_LONG).show();
 }
 });
}
}  
   
