package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int uniqueUserId;
    private final String username;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int numberOfPostedPosts;

    public ForumUser(final int uniqueUserId,final String username,final char userSex,
                     final int yearOfBirth,final int monthOfBirth,final int dayOfBirth,
                     final int numberOfPostedPosts) {
        this.uniqueUserId = uniqueUserId;
        this.username = username;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numberOfPostedPosts = numberOfPostedPosts;
    }

    public int getUniqueUserId() {
        return uniqueUserId;
    }

    public String getUsername() {
        return username;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPostedPosts() {
        return numberOfPostedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserId=" + uniqueUserId +
                ", username='" + username + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPostedPosts=" + numberOfPostedPosts +
                '}';
    }
}
