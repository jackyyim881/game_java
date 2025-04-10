package com.example.groupproject_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views
        MaterialButton btnTapCoordinate = findViewById(R.id.btnTapCoordinatePuzzle);
        MaterialButton btnTapMoveTimer = findViewById(R.id.btnTapMoveTimerPuzzle);
        MaterialButton btnMoveOverlap = findViewById(R.id.btnMoveOverlapPuzzle);
        MaterialButton btnShakeMove = findViewById(R.id.btnShakeMoveCoordinatePuzzle);
        MaterialButton btnColorSwitch = findViewById(R.id.btnColorSwitchMadness);

        // New Brain Training Game Buttons
        MaterialButton btnReactionSequence = findViewById(R.id.btnReactionSequenceChallenge);
        MaterialButton btnMathSpeed = findViewById(R.id.btnMathSpeedChallenge);
        MaterialButton btnColorMemory = findViewById(R.id.btnColorMemoryChallenge);
        MaterialButton btnScoreboard = findViewById(R.id.btnScoreboard);
        MaterialButton btnRegister = findViewById(R.id.btnRegister);
        FloatingActionButton btnLogin = findViewById(R.id.btnLogin);
        MaterialButton btnTricksterPath = findViewById(R.id.btnTricksterPath);

        View puzzleCard = findViewById(R.id.puzzleCard);

        // Animate card entrance
        puzzleCard.setTranslationY(1000f);
        puzzleCard.animate()
            .translationY(0f)
            .setDuration(800)
            .setStartDelay(200)
            .start();

        // Button click listeners
        btnTapCoordinate.setOnClickListener(v -> startActivity(new Intent(this, TapCoordinatePuzzleActivity.class)));
        btnTapMoveTimer.setOnClickListener(v -> startActivity(new Intent(this, TapMoveTimerPuzzleActivity.class)));
        btnMoveOverlap.setOnClickListener(v -> startActivity(new Intent(this, MoveOverlapPuzzleActivity.class)));
        btnShakeMove.setOnClickListener(v -> startActivity(new Intent(this, ShakeMoveCoordinatePuzzleActivity.class)));
        btnColorSwitch.setOnClickListener(v -> startActivity(new Intent(this, ColorSwitchMadnessActivity.class)));
// 在MainActivity的onCreate方法中添加代码
        btnTricksterPath.setOnClickListener(v -> startActivity(new Intent(this, TricksterPathActivity.class)));
        // New Brain Training Game Intents
        btnReactionSequence.setOnClickListener(v -> startActivity(new Intent(this, ReactionSequenceChallengeActivity.class)));
        btnMathSpeed.setOnClickListener(v -> startActivity(new Intent(this, MathSpeedChallengeActivity.class)));
        btnColorMemory.setOnClickListener(v -> startActivity(new Intent(this, ColorMemoryChallengeActivity.class)));

        btnScoreboard.setOnClickListener(v -> {
            // TODO: Implement ScoreboardActivity
            startActivity(new Intent(this, ScoreboardActivity.class));
        });
        btnRegister.setOnClickListener(v -> startActivity(new Intent(this, RegisterActivity.class)));
        btnLogin.setOnClickListener(v -> startActivity(new Intent(this, LoginActivity.class)));

        String username = getIntent().getStringExtra("username");

        // Find the TextView and display the username
        welcomeTextView = findViewById(R.id.textViewWelcome);
        welcomeTextView.setText("Welcome, " + username + "!");

    }
}