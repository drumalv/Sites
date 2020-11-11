package com.example.sites

import android.graphics.Point

internal object Miradores {
    val chana_point= Point(37.1724, -3.63118)
    val sanNicolas= Point(37.181104,-3.592653);
    val torreVelaAlhambra = Point(37.17050,-3.592230)
    val sanMiguelAlto = Point(37.184734,-3.587869)
    val sillaDelMoro = Point(37.178313,-3.583707)
    val torreonDeCartuja = Point(37.194950,-3.593758)
    val barrancoDelAbogado = Point(37.170033,-3.584908)
    val monasterioChillOut = Point(37.178866,-3.603495)
    val arraySitios = arrayOf(chana_point, sanNicolas, torreVelaAlhambra, sanMiguelAlto, sillaDelMoro,
        torreonDeCartuja, barrancoDelAbogado, monasterioChillOut)
    val arrayNombres = arrayOf("PUNTO REFERENCIA DE LA CHANA","Mirador de San Nicolás", "Mirador torre de la Vela de la Alhambra",
        "Mirador San Miguel Alto", "Mirador silla del Moro", "Mirador torreón de Cartuja", "Mirador barranco del Abogado",
        "Mirador Monasterio Chill-Out")

    fun getArray(): Array<Point> {
        return arraySitios;
    }
    fun getPosition(posicion:Int): Point {
        return arraySitios[posicion];
    }
    fun getName(posicion:Int): String {
        return arrayNombres[posicion];
    }

    class Point(var lat: Double, var lon: Double)

}