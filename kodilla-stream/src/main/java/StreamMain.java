import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        List<ForumUser> resultOfMenList = theForum.getUserList().stream()
                .filter(forumuser -> forumuser.getUserSex() == 'M')
                .collect(Collectors.toList());

        System.out.println("List of Male ForumUser contain #elements: " + resultOfMenList.size());
        resultOfMenList.stream()
                .forEach(System.out::println);

        List<ForumUser> resultListOf20YearsOldUsers = theForum.getUserList().stream()
                .filter(forumuser -> forumuser.getDateOfBirth().getYear() <= 2000)
                .collect(Collectors.toList());

        System.out.println("\nList of 20 years old users contain #elements: "
                + resultListOf20YearsOldUsers.size());
        resultListOf20YearsOldUsers.stream()
                .forEach(System.out::println);

        List<ForumUser> resultListOfPostPosted = theForum.getUserList().stream()
                .filter(forumuser -> forumuser.getNumberOfPostedPosts() >= 1)
                .collect(Collectors.toList());

        System.out.println("\nList of Users posted at least one post contain # elements: "
                + resultListOfPostPosted.size());
        resultListOfPostPosted.stream()
                .forEach(System.out::println);

        Map<Integer, ForumUser> resultOfMapForum = theForum.getUserList().stream()
                .collect(Collectors.toMap(ForumUser::getUniqueUserId, forumuser -> forumuser));

        System.out.println("\nThe forum map contains #elements: " + resultOfMapForum.size());
        resultOfMapForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
