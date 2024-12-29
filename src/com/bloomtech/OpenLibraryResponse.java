package com.bloomtech;

import java.util.ArrayList;

public class OpenLibraryResponse {
    private int numFound;
    private ArrayList<Book> docs;

    public ArrayList<Book> getDocs() {
        return docs;
    }

    public OpenLibraryResponse(int numFound, ArrayList<Book> docs) {
        this.numFound = numFound;
        this.docs = docs;
    }
}
