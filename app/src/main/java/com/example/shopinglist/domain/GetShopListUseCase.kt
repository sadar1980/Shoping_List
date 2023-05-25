package com.example.shopinglist.domain

class GetShopListUseCase(private val shopListRepository: ShopListPepository) {
    fun getShopList(): List<ShopItem>{
        return shopListRepository.getShopList()
    }
}