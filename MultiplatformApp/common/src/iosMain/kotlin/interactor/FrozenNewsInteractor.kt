package interactor

import repository.INewsRepository
import kotlin.native.concurrent.freeze

class FrozenNewsInteractor(newsRepository: INewsRepository): NewsInteractor(newsRepository) {
    init {
        freeze()
    }
}