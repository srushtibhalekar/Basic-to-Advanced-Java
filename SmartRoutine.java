
import java.time.Duration;
import java.time.LocalTime;

public class SmartRoutine {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        System.out.println("======================================");
        System.out.println("        🤖 SMART ROUTINE ASSISTANT");
        System.out.println("======================================");
        System.out.println("Current Time : " + now);
        System.out.println();

        String task;
        String nextTask;
        LocalTime start;
        LocalTime end;
        LocalTime nextStart;

        if (now.isAfter(LocalTime.of(11, 0))
                && now.isBefore(LocalTime.of(12, 0))) {

            task = "📚 Core Java Learning";
            start = LocalTime.of(11, 0);
            end = LocalTime.of(12, 0);

            nextTask = "💻 Java Coding Practice";
            nextStart = LocalTime.of(12, 0);

        } else if (now.isBefore(LocalTime.of(13, 0))) {

            task = "💻 Java Coding Practice";
            start = LocalTime.of(12, 0);
            end = LocalTime.of(13, 0);

            nextTask = "🧩 DSA Practice";
            nextStart = LocalTime.of(13, 0);

        } else if (now.isBefore(LocalTime.of(14, 0))) {

            task = "🧩 DSA Practice";
            start = LocalTime.of(13, 0);
            end = LocalTime.of(14, 0);

            nextTask = "🍱 Lunch Break";
            nextStart = LocalTime.of(14, 0);

        } else if (now.isBefore(LocalTime.of(15, 0))) {

            task = "🍱 Lunch Break";
            start = LocalTime.of(14, 0);
            end = LocalTime.of(15, 0);

            nextTask = "🚀 Java Project";
            nextStart = LocalTime.of(15, 0);

        } else if (now.isBefore(LocalTime.of(16, 0))) {

            task = "🚀 Java Project";
            start = LocalTime.of(15, 0);
            end = LocalTime.of(16, 0);

            nextTask = "📝 Interview Preparation";
            nextStart = LocalTime.of(16, 0);

        } else if (now.isBefore(LocalTime.of(17, 0))) {

            task = "📝 Interview Preparation";
            start = LocalTime.of(16, 0);
            end = LocalTime.of(17, 0);

            nextTask = "🐙 GitHub Practice";
            nextStart = LocalTime.of(17, 0);

        } else if (now.isBefore(LocalTime.of(18, 0))) {

            task = "🐙 GitHub Practice";
            start = LocalTime.of(17, 0);
            end = LocalTime.of(18, 0);

            nextTask = "☕ Free Time / Revision";
            nextStart = LocalTime.of(18, 0);

        } else {

            System.out.println("🌙 Study routine completed for today!");
            System.out.println("✨ Good job! Take rest and come back tomorrow.");
            return;
        }

        Duration remaining = Duration.between(now, end);

        long minutes = remaining.toMinutes();

        System.out.println("🔥 CURRENT TASK");
        System.out.println("--------------------------------------");
        System.out.println(task);
        System.out.println("Time: " + start + " - " + end);
        System.out.println("⏳ Time Remaining: " + minutes + " minutes");

        System.out.println();
        System.out.println("➡️ NEXT TASK");
        System.out.println("--------------------------------------");
        System.out.println(nextTask);
        System.out.println("Starts At: " + nextStart);

        System.out.println();
        System.out.println("======================================");
        System.out.println("        💪 KEEP CODING!");
        System.out.println("======================================");
    }
}

