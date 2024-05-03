package Jose.Iraheta.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class fragment_perfil : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_perfil, container, false)

        val btnMostrarInfo = root.findViewById<Button>(R.id.btnMostrarInfo)


        btnMostrarInfo.setOnClickListener {
            Toast.makeText(context, "José Luis Iraheta" , Toast.LENGTH_LONG).show()
        }

        return root
    }


}