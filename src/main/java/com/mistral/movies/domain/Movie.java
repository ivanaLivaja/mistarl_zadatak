package com.mistral.movies.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Movie {

    @Id
    private Integer id;

    private String title;

    @Column(name = "cover_image")
    private String coverImage;

    @Column(name = "tv_show")
    private Boolean tvShow;

    private String description;

    @Column(name = "release_date")
    private Date releaseDate;

    @OneToMany
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private List<Cast> cast;

    @OneToOne
    @JoinColumn(name = "movie_rate_id", referencedColumnName = "id")
    private MovieRate movieRate;

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

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public Boolean getTvShow() {
        return tvShow;
    }

    public void setTvShow(Boolean tvShow) {
        this.tvShow = tvShow;
    }

    public MovieRate getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(MovieRate movieRate) {
        this.movieRate = movieRate;
    }


}
