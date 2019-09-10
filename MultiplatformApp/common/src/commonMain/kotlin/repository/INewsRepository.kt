package repository

import models.News

interface INewsRepository {
    fun retrieveNews(): List<News>
}