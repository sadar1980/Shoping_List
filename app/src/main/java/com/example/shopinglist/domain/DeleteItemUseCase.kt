package com.example.shopinglist.domain

class DeleteItemUseCase(private val shopListRepository: ShopListPepository) {
    fun deleteItem(shopItem: ShopItem){
        shopListRepository.deleteItem(shopItem)
    }
}