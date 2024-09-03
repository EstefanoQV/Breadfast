package com.example.parcial.activities

import ProductAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial.R
import com.example.parcial.models.Product
import com.example.parcial.utils.GridSpacingItemDecoration

class ActivityHome : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val section1ImageView: ImageView = findViewById(R.id.section1ImageView)
        val section2ImageView: ImageView = findViewById(R.id.section2ImageView)
        val section3ImageView: ImageView = findViewById(R.id.section3ImageView)
        val section4ImageView: ImageView = findViewById(R.id.section4ImageView)
        val button: Button= findViewById(R.id.myPointsButton)

        // Configurar listeners para los botones ImageView
        section1ImageView.setOnClickListener {
            // Agregar lógica para el primer botón ImageView aquí
            // Por ejemplo, abrir otra actividad, ejecutar una función, etc.
        }

        section2ImageView.setOnClickListener {
            // Agregar lógica para el segundo botón ImageView aquí
            // Por ejemplo, abrir otra actividad, ejecutar una función, etc.
        }

        section3ImageView.setOnClickListener {
            val intent = Intent(this, ActivityPoints::class.java)
            startActivity(intent)
        }

        section4ImageView.setOnClickListener {
            // Agregar lógica para el cuarto botón ImageView aquí
            // Por ejemplo, abrir otra actividad, ejecutar una función, etc.
        }

        button.setOnClickListener{
            val intent = Intent(this, ActivityPoints::class.java)
            startActivity(intent)
        }
        // Inicializar la lista de productos con datos de ejemplo
        val productList = generateSampleProductList()

        // Configurar RecyclerView
        recyclerView = findViewById(R.id.productRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.addItemDecoration(GridSpacingItemDecoration(2, 8, true))
        productAdapter = ProductAdapter(productList)
        recyclerView.adapter = productAdapter
    }

    private fun generateSampleProductList(): List<Product> {
        val productList = ArrayList<Product>()
        productList.add(Product("Chessecake", "Chocolate", 50.00, R.drawable.cheesecakec))
        productList.add(Product("Chessecake", "Oreo", 60.00, R.drawable.cheesecakeoreo))
        productList.add(Product("Chessecake", "Maracuyá", 50.00, R.drawable.cheesecakem))
        productList.add(Product("Chessecake", "Fresa", 40.00, R.drawable.chessecakef))
        productList.add(Product("Chessecake", "Chocolate", 50.00, R.drawable.cheesecakec))
        productList.add(Product("Chessecake", "Oreo", 60.00, R.drawable.cheesecakeoreo))
        productList.add(Product("Chessecake", "Maracuyá", 50.0, R.drawable.cheesecakem))
        return productList
    }
}

