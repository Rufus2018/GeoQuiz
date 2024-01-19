package com.sdiarra.geoquiz2024;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.sdiarra.geoquiz2024.databinding.ActivityQuizBinding;

public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mTrueButton = (Button)
                findViewById(R.id.true_button);
        mFalseButton = (Button)
                findViewById(R.id.false_button);
      }


}