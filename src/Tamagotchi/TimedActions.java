package Tamagotchi;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimedActions {

    //ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
    static Timer timer = new Timer();


    //time.cancel
    public static void timer30minutes(Tamagotchi tamagotchi) {
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                tamagotchi.downHunger(1);
                System.out.println(tamagotchi.getHunger());
            }
        }, 0, TimeUnit.SECONDS.toMillis(3));
    }

}
