package abstractions.task9;

public class Main {
    public static void main(String[] args) {
        SocialMediaSharer socialMediaSharer = new FacebookSharer();
        SocialMediaSharer socialMediaSharer1 = new LinkedInSharer();
        SocialMediaSharer socialMediaSharer2 = new TwitterSharer();

        socialMediaSharer1.sharePost("today was...");
        socialMediaSharer2.sharePost("New meta was released.");
        socialMediaSharer.sharePost("Some post about my cat");
    }
}
