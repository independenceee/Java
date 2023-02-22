public class Main {

    public static void main(String[] args) {

        // Timer = cơ sở cho các luồng lên lịch các tác vụ
        //         để thực hiện trong tương lai một luồng liền


        // TimerTask = một nhiệm vụ có thể lên lịch một lần
        // hoặc thực hiên lặp đi lặp lại với Timer

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;


            @Override
            public void run() {
                if(counter >0) {
                    System.out.println(counter + "seconds");
                    counter --;
                } else {
                    System.out.println("Heloo");
                    timer.cancel();
                }
            }
        }


        timer.schedule(task, 0); // setTimeout
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2000);
        date.set(Calendar.MONTH, Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 31);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MINISECOND, 0);


        timer.schedule(task, date.getTime()); // setTimeout
        timer.scheduleAtFixedRate(task,0, 1000); // setInterval
        timer.scheduleAtFixedRate(task,date.getTime(), 1000); // setInterval


    }

}