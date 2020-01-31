package com.mocavada.app.service.xml;

import com.mocavada.app.domain.xml.Book;

import java.util.Map;


public interface BookService {
    Map<Book, Long> getTotalBookInventoryOnHand();
    long getBookQuantityOnHand(String itemId);
    void adjustBookInventory(String itemId, long quantity);
}
