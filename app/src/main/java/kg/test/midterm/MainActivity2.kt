package kg.test.midterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val next = findViewById<ImageButton>(R.id.next)

        next.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}