package com.mistral.movies.dto;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MovieRateDto {

    private int id;

    private Integer userCount;

    private Integer grade;

    private BigDecimal avrgRate;

    private ArrayList<Integer> stars;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public BigDecimal getAvrgRate() {
        return avrgRate;
    }

    public void setAvrgRate(BigDecimal avrgRate) {
        this.avrgRate = avrgRate;
    }

    public ArrayList<Integer> getStars() {
        return stars;
    }

    public void setStars(ArrayList<Integer> stars) {
        this.stars = stars;
    }
}
