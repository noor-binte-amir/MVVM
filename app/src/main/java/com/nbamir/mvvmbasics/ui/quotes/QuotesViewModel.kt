package com.nbamir.mvvmbasics.ui.quotes

import androidx.lifecycle.ViewModel
import com.nbamir.mvvmbasics.data.Quote
import com.nbamir.mvvmbasics.data.QuoteRepository


class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}