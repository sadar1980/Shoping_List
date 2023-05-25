package com.example.shopinglist.domain

interface ShopListPepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}