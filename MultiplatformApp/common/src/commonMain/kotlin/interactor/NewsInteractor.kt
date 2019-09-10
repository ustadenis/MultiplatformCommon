package interactor

import models.News
import repository.INewsRepository

open class NewsInteractor(
    private val newsRepository: INewsRepository
) {

    fun retrieveNews(): List<News> {
        return newsRepository.retrieveNews()
    }

}