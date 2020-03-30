import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, ForumUser> resultOfForumMap = theForum.getUserList().stream()
                .filter(forumuser -> forumuser.getUserSex() == 'M' &&
                        forumuser.getDateOfBirth().getYear() <= 2000 &&
                        forumuser.getNumberOfPostedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserId, forumuser -> forumuser));

        System.out.println("\nThe forum map contains #elements: " + resultOfForumMap.size());
        resultOfForumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
