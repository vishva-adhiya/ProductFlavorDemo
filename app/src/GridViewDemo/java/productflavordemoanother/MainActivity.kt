package productflavordemoanother

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.example.grid_demo_pro.GridModel
import com.example.productflavordemoanother.R

class MainActivity : AppCompatActivity() {
    private var gridView: GridView? =null
    private var arrayList:ArrayList<GridModel> ? =null
    private var demoAdapter : GridAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridviewdemo)
        arrayList = ArrayList()
        arrayList = setData()
        demoAdapter = GridAdapter(applicationContext,arrayList!!)
        gridView?.adapter = demoAdapter

    }

    private fun setData() : ArrayList<GridModel>{
        val arrayList : ArrayList<GridModel> = ArrayList()

        arrayList.add(GridModel(R.drawable.firth,"First"))
        arrayList.add(GridModel(R.drawable.two,"second"))
        arrayList.add(GridModel(R.drawable.third,"Third"))
        arrayList.add(GridModel(R.drawable.fourth,"Fourth"))
        arrayList.add(GridModel(R.drawable.fifth,"Fifth"))
        arrayList.add(GridModel(R.drawable.sixth,"Sixth"))
        arrayList.add(GridModel(R.drawable.seventh,"Seventh"))

        return arrayList
    }


}