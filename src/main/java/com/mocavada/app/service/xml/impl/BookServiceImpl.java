package com.mocavada.app.service.xml.impl;

import com.mocavada.app.data.repository.xml.BookItemRepository;
import com.mocavada.app.domain.xml.Book;
import com.mocavada.app.service.xml.BookService;

import java.util.Map;


public class BookServiceImpl implements BookService {

    private final BookItemRepository bookItemRepository;

    public BookServiceImpl(BookItemRepository bookItemRepository) {
        this.bookItemRepository = bookItemRepository;
    }

    @Override
    public Map<Book, Long> getTotalBookInventoryOnHand() {
        return null;
    }

    @Override
    public long getBookQuantityOnHand(String itemId) {
        return 0;
    }

    @Override
    public void adjustBookInventory(String itemId, long quantity) {

    }
}
