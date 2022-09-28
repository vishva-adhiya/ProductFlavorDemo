package productflavordemoanother

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.productflavordemoanother.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "RecyclerView product flavor"


        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<RecyclerModel>()
        var model = RecyclerModel("The Patel Restaurant", "10am to 8pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Honest", "9am to 10pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Real Paprika", "10:30am to 10pm", "Read more..")
        data.add(model)
        model = RecyclerModel("The Patel Restaurant", "10am to 8pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Honest", "9am to 10pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Real Paprika", "10:30am to 10pm", "Read more..")
        data.add(model)
        model = RecyclerModel("The Patel Restaurant", "10am to 8pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Honest", "9am to 10pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Real Paprika", "10:30am to 10pm", "Read more..")
        data.add(model)
        model = RecyclerModel("The Patel Restaurant", "10am to 8pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Honest", "9am to 10pm", "Read more..")
        data.add(model)
        model = RecyclerModel("Real Paprika", "10:30am to 10pm", "Read more..")
        data.add(model)

        val adapter = RecyclerAdapter(this, data)
        recyclerView.adapter = adapter
    }

}