package com.nawanganggita_19102244.praktikum5

object Datasample {
    private val namasampel= arrayOf(
        "Baturaden",
        "Small World",
        "Watu Jajar"
    )
    private val deskripsisampel= arrayOf(
        "Desa Wisata yang ada di Batturaden",
        "Miniatur Dunia",
        "Pemandangan indah dari atas bukit"
    )
    private val gambarsampel= intArrayOf(
        R.drawable.wall1,
        R.drawable.wall2,
        R.drawable.wall3
    )
    private val latsampel= doubleArrayOf(
        -7.3229791,
        -7.332746,
        -7.1449766
    )
    private val longsampel= doubleArrayOf(
        109.1504178,
        109.2226665,
        109.1474992
    )
    val listData: ArrayList<DataClassWisata>
    get() {
        val listDataku = arrayListOf<DataClassWisata>()
        for(position in namasampel.indices){
            val data = DataClassWisata()
            data.namaWisata = namasampel[position]
            data.deskripsi = deskripsisampel[position]
            data.sampleImage = gambarsampel[position]
            data.lat = latsampel[position]
            data.long = longsampel[position]
            listDataku.add(data)
        }
        return  listDataku
    }


}