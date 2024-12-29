package com.bloomtech;

import com.google.gson.annotations.SerializedName;

public class Book {
    private String title;
    private String authorName;
    private String firstSentence;
    @SerializedName("first_publish_year")
    private int firstPublishedYear;

    @SerializedName("author_name")
    private String[] authorNameArray;
    @SerializedName("first_sentence")
    private String[] firstSentenceArray;

    public Book(String title, String authorName, String firstSentence, int firstPublishedYear, String[] authorNameArray, String[] firstSentenceArray) {
        this.title = title;
        this.authorName = authorName;
        this.firstSentence = firstSentence;
        this.firstPublishedYear = firstPublishedYear;
        this.authorNameArray = authorNameArray;
        this.firstSentenceArray = firstSentenceArray;
    }

    public String getAuthorName() {
        if (authorName == null) {
            authorName = authorNameArray[0];
        }
        return authorName;
    }

    public String getFirstSentence() {
        if (firstSentence == null) {
            firstSentence = firstSentenceArray[0];
        }
        return firstSentence;
    }

    @Override
    public String toString() {
        return "\""+ title +"\" by "+ getAuthorName() + " ("+ firstPublishedYear + ") \n "+ getFirstSentence() + "";
    }
}
