package com.cezar.recycleview.data

import com.cezar.recycleview.R
import com.cezar.recycleview.model.Affirmation

class Datasource {
    fun loadAffrimations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.test1),
            Affirmation(R.string.test2),
            Affirmation(R.string.test3),
            Affirmation(R.string.test4),
            Affirmation(R.string.test5),
            Affirmation(R.string.test6),
            Affirmation(R.string.test7),
            Affirmation(R.string.test8),

        )
    }
}