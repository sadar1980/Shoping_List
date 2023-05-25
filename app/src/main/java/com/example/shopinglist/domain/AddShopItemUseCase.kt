package com.example.shopinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListPepository) {
    fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}