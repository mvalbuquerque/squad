package br.com.appinstitucional

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivEmpresa = findViewById<ImageView>(R.id.ivEmpresa)
        val ivClient = findViewById<ImageView>(R.id.ivClient)
        val ivContactUs = findViewById<ImageView>(R.id.ivContactUs)
        val ivServico = findViewById<ImageView>(R.id.ivServico)

        ivEmpresa.setOnClickListener{
            val intentEmpresa = Intent(this, EmpresaActivity::class.java)
            startActivity(intentEmpresa)
        }
        ivClient.setOnClickListener{
            val intentClient = Intent(this, ClientActivity::class.java)
            startActivity(intentClient)
        }
        ivContactUs.setOnClickListener{
            val intentContactUs = Intent(this, ContactUsActivity::class.java)
            startActivity(intentContactUs)
        }
        ivServico.setOnClickListener{
            val intentService = Intent(this, ServiceActivity::class.java)
            startActivity(intentService)
        }
    }
}