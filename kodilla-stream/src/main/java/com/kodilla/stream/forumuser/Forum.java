package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {

        theUserList.add(new ForumUser(1345,"mavrick",'M',
                1985, 10,23,45));
        theUserList.add(new ForumUser(1267,"Gabi",'F',
                2005,6,15,5));
        theUserList.add(new ForumUser(7545,"Goldi",'M',
                2004,7,25,0));
        theUserList.add(new ForumUser(2543,"Anna",'F',
                1998,3,17,35));
        theUserList.add(new ForumUser(8745,"Adi",'M',
                2000,7,22,1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}