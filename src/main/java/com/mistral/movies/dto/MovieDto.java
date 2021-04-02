package com.mistral.movies.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class MovieDto{

    private Integer id;

    private String title;

    private String coverImage;

    private Boolean tvShow;

    private String description;

    private Date releaseDate;

    private List<CastDto> cast;

    private MovieRateDto movieRate;

    private BigDecimal sortByValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<CastDto> getCast() {
        return cast;
    }

    public void setCast(List<CastDto> cast) {
        this.cast = cast;
    }

    public Boolean getTvShow() {
        return tvShow;
    }

    public void setTvShow(Boolean tvShow) {
        this.tvShow = tvShow;
    }

    public MovieRateDto getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(MovieRateDto movieRate) {
        this.movieRate = movieRate;
    }

    public BigDecimal getSortByValue() {
        return sortByValue;
    }

    public void setSortByValue(BigDecimal sortByValue) {
        this.sortByValue = sortByValue;
    }

}
