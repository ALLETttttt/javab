package abstractions.task9;

public class TwitterSharer implements SocialMediaSharer {
    @Override
    public void sharePost(String postContent) {
        System.out.println("Sharing content via Twitter: " + postContent);
    }
}
