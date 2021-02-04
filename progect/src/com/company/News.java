package com.company;

public class News {
    private String fuculty;
    private String news;

    public News(){}

    public News(String fuculty, String news){
        this.fuculty =fuculty;
        this.news = news;
    }
    public  News(String news){
        this.news=news;
    }

    public String getFuculty() {
        return fuculty;
    }

    public void setFuculty(String fuculty) {
        this.fuculty = fuculty;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "News{" +
                "fuculty='" + fuculty + '\'' +
                ", news='" + news + '\'' +
                '}';
    }
}
