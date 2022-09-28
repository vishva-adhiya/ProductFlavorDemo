package productflavordemoanother

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.productflavordemoanother.R

class RecyclerAdapter(private val context: Context, private val menuList : List<RecyclerModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(Itemview : View) : RecyclerView.ViewHolder(Itemview) {
        val txtview = Itemview.findViewById<TextView>(R.id.textview)!!
        val txtview2 = Itemview.findViewById<TextView>(R.id.textview2)!!
        val txtview3 = Itemview.findViewById<TextView>(R.id.textview3)!!
        val cardviewlist = Itemview.findViewById<CardView>(R.id.cardviewlist)!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = menuList[position]
        if(position%2==0){
            holder.itemView.setBackgroundColor(Color.parseColor("#F94892"))
        }else{
            holder.itemView.setBackgroundColor(Color.parseColor("#F675A8"))
        }
        holder.txtview.text = itemsViewModel.text
        holder.txtview2.text = itemsViewModel.text2
        holder.txtview3.text = itemsViewModel.text3
        holder.cardviewlist.setOnClickListener{
            Toast.makeText(context,"value is ${itemsViewModel.text}",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return menuList.size
    }
}