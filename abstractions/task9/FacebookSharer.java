package abstractions.task9;

public class FacebookSharer implements SocialMediaSharer {
    @Override
    public void sharePost(String postContent) {
        System.out.println("Sharing content via Facebook: " + postContent);
    }
}
