import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.parcial.R

class ActivityProductDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        // Obtener los datos del producto de la actividad anterior
        val productName = intent.getStringExtra("productName")
        val productPrice = intent.getStringExtra("productPrice")
        val productDescription = intent.getStringExtra("productDescription")
        val productImageResId = intent.getIntExtra("productImageResId", R.drawable.cheesecakec)

        // Obtener referencias a las vistas
        val textViewProductName = findViewById<TextView>(R.id.textViewTitle)
        val textViewProductPrice = findViewById<TextView>(R.id.textViewPriceValue)
        val textViewProductDescription = findViewById<TextView>(R.id.textViewDescriptionContent)
        val imageViewProductDetail = findViewById<ImageView>(R.id.imageViewProduct)

        // Establecer los datos del producto en las vistas
        textViewProductName.text = productName
        textViewProductPrice.text = productPrice
        textViewProductDescription.text = productDescription
        imageViewProductDetail.setImageResource(productImageResId)
    }
}
