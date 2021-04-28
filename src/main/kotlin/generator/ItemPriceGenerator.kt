package generator

import model.ItemPrice

object ItemPriceGenerator {
    fun getItems(): ArrayList<ItemPrice>{
        return arrayListOf<ItemPrice>().apply {
            add(ItemPrice("Xiaomi Mi 11",9999000))
            add(ItemPrice("Kulkas",2000000))
            add(ItemPrice("TV",500000))
            add(ItemPrice("Emas 10 gr",10000000))
            add(ItemPrice("Apel Busuk",20000000))
        }
    }
}