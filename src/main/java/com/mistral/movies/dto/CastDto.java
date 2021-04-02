package com.mistral.movies.dto;

public class CastDto {

    private Integer id;

    private Integer movieId;

    private CastMemberDto castMember;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CastMemberDto getCastMember() {
        return castMember;
    }

    public void setCastMember(CastMemberDto castMember) {
        this.castMember = castMember;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
