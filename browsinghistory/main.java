package grind.browsinghistory;
public class main {

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        // Test 1: Starting state
        System.out.println("Initial page: " + browser.currentpage());  // should be null

        // Test 2: Visit sequence
        browser.visit("google.com");
        System.out.println("\nAfter first visit: " + browser.currentpage());  // google.com

        browser.visit("youtube.com");
        browser.visit("facebook.com");
        System.out.println("After more visits: " + browser.currentpage());  // facebook.com

        // Test 3: Back navigation
        browser.back();
        System.out.println("\nAfter back: " + browser.currentpage());  // youtube.com

        // Test 4: Forward navigation
        browser.forward();
        System.out.println("After forward: " + browser.currentpage());  // facebook.com

        // Test 5: Visit after back
        browser.back();
        browser.visit("twitter.com");
        System.out.println("\nAfter visit from middle: " + browser.currentpage());  // twitter.com
    }
}