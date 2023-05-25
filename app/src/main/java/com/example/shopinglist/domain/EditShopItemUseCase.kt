package com.example.shopinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListPepository) {
    fun editShopItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)
    }
}