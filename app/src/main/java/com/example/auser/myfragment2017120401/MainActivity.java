package com.example.auser.myfragment2017120401;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

////執行順序為
//fragment.onAttach()==>fragment.onCreate()==>fragment.onCreateView()
//==>activity.onCreate()==>fragment.onActivityCreated()
//==>activity.onStart()==>fragement.onStart()
//==>activity.onResume()==>fragement.onResume()
public class MainActivity extends AppCompatActivity {
    FragmentManager fm;//選v4的
    FragmentA frag1;
//    Fragment2 frag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentA=getSupportFragmentManager();//方法二,若fragment也是有帶support字樣的,可以向下相容/…
//        frag1=(FragmentA)fm.findFragmentById(R.id.fragment1);
////        frag2=(Fragment2)fm.findFragmentById(R.id.fragment2);
//        Button btnA=findViewById(R.id.buttonA);
    }
}
