package cjw.pe.googlecalendarevents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.api.client.extensions.android.http.AndroidHttp
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import com.google.api.client.http.HttpTransport
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.calendar.Calendar
import com.google.api.services.calendar.CalendarScopes

class MainActivity : AppCompatActivity() {
    private val scopes = arrayOf(CalendarScopes.CALENDAR_READONLY)

    private val transport = AndroidHttp.newCompatibleTransport()
    private val jsonFactory = GsonFactory.getDefaultInstance()
    private val mCredential = GoogleAccountCredential.usingOAuth2(this, scopes.asList())
    private var mService:Calendar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}