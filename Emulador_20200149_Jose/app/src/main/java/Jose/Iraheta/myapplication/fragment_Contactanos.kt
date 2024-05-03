package Jose.Iraheta.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class fragment_Contactanos : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment__contactanos, container, false)

        val btnEmail = root.findViewById<Button>(R.id.btnEmail)

        btnEmail.setOnClickListener {
            Toast.makeText(context, "20200149@ricaldone.edu.sv", Toast.LENGTH_LONG).show()
        }

        return root
    }

}