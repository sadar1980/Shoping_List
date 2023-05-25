package com.example.shopinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListPepository) {
    fun getShopItem(shopItemId: Int): ShopItem{
       return shopListRepository.getShopItem(shopItemId)
    }
}