package com.example.vance.myexperience;

import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;

/**
 * Created by Vance on 6/7/2017.
 */

public class YouTubeForJavaDesktopActivity extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener{

    private static final int RECOVERY_DIALOG_REQUEST = 1;

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else {
            //String errorMessage = String.format(getString(R.string.error_player), errorReason.toString());
            String errorMessage = "custom ERror MessAgE";
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider arg0, YouTubePlayer player,
                                        boolean wasRestored) {
        // TODO Auto-generated method stub
        if (!wasRestored) {
            player.cueVideo("_BK0b3UUywQ");
        }
    }

    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        // TODO Auto-generated method stub
        return (YouTubePlayerFragment) getFragmentManager().findFragmentById(
                R.id.youtube_fragment);
    }
}
