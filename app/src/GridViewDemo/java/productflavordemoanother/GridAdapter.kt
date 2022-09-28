package productflavordemoanother

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.grid_demo_pro.GridModel
import com.example.productflavordemoanother.R

class GridAdapter(private var context: Context, private var arrayList: ArrayList<GridModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = View.inflate(context, R.layout.grid_item,null)

        val icons = view.findViewById<ImageView>(R.id.icon)
        val names = view.findViewById<TextView>(R.id.text_names)

        val lItems : GridModel = arrayList[position]

        icons.setImageResource(lItems.icons!!)
        names.text = lItems.name


        return view
    }
}