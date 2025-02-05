public class SimpleStartupGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        int[] deadLocations;


        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theStartup.setLocationCells(locations);
        deadLocations = new int[theStartup.getLocationCells().length];

        boolean isAlive = true;
        boolean isRepeat = false;
        int i = 0;
        while (isAlive) {
            int guess = helper.getUserInput("enter a number");
            for (int dead: deadLocations) {
                if (guess == dead) {
                    System.out.println("다른 수를 입력해주세요");
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat == true) {
                isRepeat = false;
                continue;
            }

            String result = theStartup.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } else if (result.equals("hit")) {
                deadLocations[i] = guess;
                i++;
                isRepeat = false;
            }
        }
    }
}