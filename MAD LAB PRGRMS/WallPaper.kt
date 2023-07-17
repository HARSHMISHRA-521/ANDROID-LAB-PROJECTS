\* Wallpaper MainActivity.kt File*\
import android.app.WallpaperManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() 
{
    var myWallpaperList = arrayOf(R.drawable.wallpaper4,R.drawable.wallpaper2,R.drawable.wallpaper3,R.drawable.wallpaper5,R.drawable.wallpaper1)
    override fun onCreate(savedInstanceState: Bundle?) 
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WPBtn.setOnClickListener 
        { 
            setWallpaper() 
        }
    }
    private fun setWallpaper() 
    {
        Toast.makeText(this, "Setting Wallpaper please wait.", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            for(i in myWallpaperList) 
            {
                val pic: Bitmap = BitmapFactory.decodeResource(resources, i)
                val wM = WallpaperManager.getInstance(baseContext)
                wM.setBitmap(pic)
            }
        }, 2000)
    }
}
