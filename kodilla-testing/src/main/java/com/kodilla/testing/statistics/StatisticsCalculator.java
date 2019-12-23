package com.kodilla.testing.statistics;

public class StatisticsCalculator {

    private int userNumber;
    private int postsNumber;
    private int commentsNumber;
    private int avgPostPerUser ;
    private int avgCommentPerUser;
    private int avgCommentPerPost;

    public int getUserNumber() {
        return userNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public int getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public int getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public int getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userNumber = statistics.userNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (userNumber != 0) {
            avgPostPerUser = postsNumber / userNumber;
        } else {
            avgPostPerUser = 0;
        }
        if (userNumber != 0) {
            avgCommentPerUser = commentsNumber / userNumber;
        } else {
            avgCommentPerUser = 0;
        }
        if (postsNumber != 0) {
            avgCommentPerPost = commentsNumber / postsNumber;
        } else {
            avgCommentPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Users Quantity: " + userNumber + "Posts Quantity: " + postsNumber + "Comments Quantity: "
                + commentsNumber + "\nAvg Post per User: " + avgPostPerUser + "\n Avg Comment per User: "
                + avgCommentPerUser + "\n Avg Comment per Post: " + avgCommentPerPost);
    }
}
