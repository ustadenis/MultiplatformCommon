package models

import kotlin.native.concurrent.freeze

actual class News(
    val iconUrl: String?,
    val newsTitle: String,
    val newsDescription: String
) {
    init {
        freeze()
    }
}