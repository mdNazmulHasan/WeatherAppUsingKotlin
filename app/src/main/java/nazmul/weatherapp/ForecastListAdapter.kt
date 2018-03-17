package nazmul.weatherapp

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by nazmu on 3/18/2018.
 */
class ForecastListAdapter(private val items:List<String>): RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun getItemCount(): Int =items.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent!!.context))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        if (holder != null) {
            holder.textView.text=items[position]
        }
    }

    class ViewHolder(val textView:TextView):RecyclerView.ViewHolder(textView)
}