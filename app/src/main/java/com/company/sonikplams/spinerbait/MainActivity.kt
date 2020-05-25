package com.company.sonikplams.spinerbait

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.androidbuts.multispinnerfilter.KeyPairBoolData
import com.androidbuts.multispinnerfilter.MultiSpinnerSearch
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = Arrays.asList<String>(*resources.getStringArray(R.array.sports_array))

        val listArray0: MutableList<KeyPairBoolData> = ArrayList()

        val list2 = Arrays.asList<Int>(
            R.drawable.redworm,
            R.drawable.redworm,
            R.drawable.blackworm,
            R.drawable.blav,
            R.drawable.black2,
            R.drawable.kisspng,
            R.drawable.redworm,
            R.drawable.redworm
        )


        for (i in list.indices) {
            val h = KeyPairBoolData()
            h.id = i + 1.toLong()
            h.name = list[i]
            h.isSelected = false
            listArray0.add(h)
        }


        val searchMultiSpinnerUnlimited = findViewById(R.id.searchMultiSpinnerUnlimited) as MultiSpinnerSearch


        searchMultiSpinnerUnlimited.setEmptyTitle("Not Data Found!")
        searchMultiSpinnerUnlimited.setSearchHint("Find Data")

        searchMultiSpinnerUnlimited.setItems(
            listArray0, -1
        ) { items ->
            for (i in items.indices) {
                if (items[i].isSelected) {
                    Toast.makeText(baseContext,i.toString() + " : " + items[i].name + " : " + items[i]
                        .isSelected, Toast.LENGTH_SHORT).show()

                }
            }
        }

    }
}


