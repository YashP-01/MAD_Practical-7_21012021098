package com.example.mad_practical_7_21012021098

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.example.mad_practical_7_21012021098.R.id.youtube_webview
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.androidgamesdk.gametextinput.Settings

class YoutubeActivity : AppCompatActivity() {

    private fun initYoutubePlayer() {
        val webView = findViewById<WebView>(R.id.youtube_webview)
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        // Replace this with the standard YouTube URL
        val youtubeUrl = "https://www.youtube.com/watch?v=L5Qz0_45vOI"

        // Load the YouTube URL into the WebView
        webView.loadUrl(youtubeUrl)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        // Initialize the WebView to display the YouTube video
        initYoutubePlayer()

        val ytWebView: FloatingActionButton = findViewById(R.id.floatingActionButton2)

        ytWebView.setOnClickListener() {
            Intent(this@YoutubeActivity, MainActivity::class.java).also { startActivity(it) }
        }
    }
}