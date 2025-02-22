package abstractions.task9;

public class LinkedInSharer implements SocialMediaSharer {
    @Override
    public void sharePost(String postContent) {
        System.out.println("Sharing content via Linkedin: " + postContent);
    }
}
