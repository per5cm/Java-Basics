import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate three random numbers between 0 and 99
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);

        // Sum the numbers
        int sum = num1 + num2 + num3;

        // Print the numbers and their sum
        System.out.println("First random number: " + num1);
        System.out.println("Second random number: " + num2);
        System.out.println("Third random number: " + num3);
        System.out.println("Sum: " + sum);

        // Get a haiku based on the sum
        String haiku = HaikuGenerator.getHaiku(sum);

        // Print the haiku
        System.out.println("Haiku:\n" + haiku);
    }
}

class HaikuGenerator {

    private static String[] haikus = {
        "Morning dew glistens,\nSpider's web a fragile thread,\nSun's first light whispers.",
        "Autumn leaves cascade,\nWhispering their last goodbyes,\nEarth prepares for sleep.",
        "Gentle summer breeze,\nCarries scent of blooming fields,\nNature's soft embrace.",
        "Winter's silent night,\nSnowflakes dance in moonlit sky,\nWorld wrapped in quiet.",
        "Blossoms in full bloom,\nPetals drift like pink snowflakes,\nSpring's fleeting beauty.",
        "Crimson sunset sky,\nBirds fly homeward in twilight,\nDay's end softly falls.",
        "Waves crash on the shore,\nRhythmic song of ocean's heart,\nEternal whisper.",
        "Silent forest path,\nFootsteps muffled by soft leaves,\nNature's calm embrace.",
        "Golden fields of wheat,\nBowing heads in summer's breeze,\nHarvest time draws near.",
        "Snowy peaks stand tall,\nGuardians of the valley,\nSilent, timeless watch.",
        "Spring rain gently falls,\nAwakening sleeping earth,\nLife renews again.",
        "Cicadas singing,\nSummer heat in full display,\nNature's symphony.",
        "Autumn's chill descends,\nLeaves turn gold and crimson bright,\nSeasons' dance unfolds.",
        "Stars adorn the night,\nWhispers of the universe,\nInfinite and vast.",
        "Bamboo sways lightly,\nIn the cool evening's soft breeze,\nPeace in every leaf."
    };

    public static String getHaiku(int sum) {
        // Use the sum to select a haiku from the array
        // This ensures that we always get a valid index in the haikus array
        int index = sum % haikus.length;
        return haikus[index];
    }
}

