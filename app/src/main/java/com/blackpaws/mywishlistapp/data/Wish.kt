package com.blackpaws.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An Android Watch"),
        Wish(title = "Google Watch 3", description = "An Android Watch"),
        Wish(title = "Google Watch 4", description = "An Android Watch")
    )
}
