package pages;

public abstract class BasePage {

    public static String baseUrl = "https://www.google.com";

    public abstract String getUrl();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
