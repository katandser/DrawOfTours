import java.util.Random;

public class Human {

    private String firstName;
    private String secondName;
    private int rating;
    private boolean motion;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getRating() {
        return rating;
    }

    public Human() {
        String string = new String();
        Random random = new Random();
        this.rating = random.nextInt(1000) + 1500;

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = random.nextInt(5) + 3;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        this.firstName = buffer.toString();
        targetStringLength = random.nextInt(5) + 3;
        buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        this.secondName = buffer.toString();
    }

    @Override
    public String toString() {
        return getSecondName() + " " + getFirstName() + " " + getRating();
    }

    public Human(String firstName, String secondName, int rating) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.rating = rating;
    }

}