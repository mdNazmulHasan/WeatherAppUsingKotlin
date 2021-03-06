package nazmul.weatherapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items= listOf<String>("sample","another sample")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forecastList=findViewById<RecyclerView>(R.id.forecast_list);
        forecastList.layoutManager=LinearLayoutManager(this);
        forecastList.adapter=ForecastListAdapter(items)
    }
}
