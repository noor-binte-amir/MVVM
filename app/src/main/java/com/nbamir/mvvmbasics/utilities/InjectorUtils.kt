package com.nbamir.mvvmbasics.utilities

import com.nbamir.mvvmbasics.data.FakeDatabase
import com.nbamir.mvvmbasics.data.QuoteRepository
import com.nbamir.mvvmbasics.ui.quotes.QuotesViewModelFactory


object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}