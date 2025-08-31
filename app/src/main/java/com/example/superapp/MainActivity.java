package com.example.superapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    Button button;
    TextView textView;
    FirebaseUser user;
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        button = findViewById(R.id.logout);
        textView = findViewById(R.id.user_details);


        user = auth.getCurrentUser();
        if (user == null){
            Intent intent = new Intent(getApplicationContext(), login.class);
            startActivity(intent);
            finish();
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
                finish();
            }
        });



        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        Button youtubeButton = findViewById(R.id.youtube_button);
        Button tiktokButton = findViewById(R.id.btn_tiktok);
        Button instagramButton = findViewById(R.id.btn_instagram);
        Button facebookButton = findViewById(R.id.btn_facebook);
        Button twitterButton = findViewById(R.id.btn_twitter);
        Button whatsappButton = findViewById(R.id.btn_whatsapp);
        Button pinterestButton = findViewById(R.id.btn_pinterest);
        Button spotifyButton = findViewById(R.id.btn_spotify);
        Button appleButton = findViewById(R.id.btn_apple);
        Button boomplayButton = findViewById(R.id.btn_BoomPlay);
        Button youtubemusicButton = findViewById(R.id.youtubemusic);
        Button livescoreButton = findViewById(R.id.btn_Livescore);
        Button SportpesaButton = findViewById(R.id.btn_Sportpesa);
        Button ESPNButton = findViewById(R.id.btn_ESPN);
        Button solitaireButton = findViewById(R.id.btn_solitaire);
        Button tetrisButton = findViewById(R.id.btn_tetris);
        Button ludoButton = findViewById(R.id.btn_ludo);







        // Set OnClickListener for the YouTube button
        youtubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the TikTok button
        tiktokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the Instagram button
        instagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the Facebook button
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the Twitter button
        twitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the Whatsapp button
        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.whatsapp.com/"));
                startActivity(intent);
            }
        });

        pinterestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube Music app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pinterest.com/search/?&browserType=1&f=co&f=co"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the Spotify button
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the AppleMusic button
        appleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.apple.com/"));
                startActivity(intent);
            }
        });

        youtubemusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube Music app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.youtube.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the BoomPlay button
        boomplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.boomplay.com/"));
                startActivity(intent);
            }
        });

        youtubemusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube Music app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.youtube.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the Livescore button
        livescoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open YouTube app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.livescore.com/en/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the Sportpesa button
        SportpesaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ke.sportpesa.com/en/sports-betting/football-1/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the ESPN button
        ESPNButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Sportpesa app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://africa.espn.com/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the solitaire button
        solitaireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open solitaire app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sonsaur.com/solitaire/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the solitaire button
        tetrisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open tetris app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sonsaur.com/super-tetris/"));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the ludo button
        ludoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open tetris app or website
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sonsaur.com/ludo-classic/"));
                startActivity(intent);
            }
        });

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.navSettings) {
            Intent intent = new Intent(MainActivity.this, Settings.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.navApps) {
            Intent intent = new Intent(MainActivity.this, Apps.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.navGames) {
            Intent intent = new Intent(MainActivity.this, Games.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.navContact) {
            Intent intent = new Intent(MainActivity.this, Contact_us.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
