package com.github.howeyc.slideshow.helper;

public class Keys {

/* Keys for the download-parameters */
    public static final String PICFRAMEPATH = "picframeRootPath";
    public static final String CALLBACK = "callback";
    public static final String CONTEXT = "context";

/* Keys for the notification */
    public static final int NOTIFICATION_ID = 654321;
    public enum NotificationStates {
        START, PROGRESS, FINISHED, STOP, INTERRUPT, FAILURE ;
        private static NotificationStates[] allValues = values();
        public static NotificationStates getStatesForInt(int num) {
            try{
                return allValues[num];
            } catch(ArrayIndexOutOfBoundsException e) {
                return STOP;
            }
        }
    }

/* Keys for the local broadcasts between actvities, notification and service */
    // FROM ACTIVITY TO SERVICE(started with startService(intent) )
    public static final String ACTION_STARTDOWNLOAD = "com.github.howeyc.slideshow.service.STARTDOWNLOAD";
            // FROM SERVICE TO RECEIVER (started with .sendBroadcast(intent) )
            //public static final String ACTION_PROGRESSUPDATE = "com.github.howeyc.slideshow.service.PROGRESSUPDATE";
            // FROM SERVICE TO RECEIVER
            //public static final String ACTION_FAILURE = "com.github.howeyc.slideshow.service.ERROR";
    // FROM NOTIFICATION TO SERVICE (to stop download and service)
    public static final String ACTION_STOPDOWNLOAD = "com.github.howeyc.slideshow.service.STOPDOWNLOAD";
    // FROM SERVICE TO ACTIVITY/RECEIVER
    public static final String ACTION_DOWNLOAD_FINISHED = "com.github.howeyc.slideshow.service.DOWNLOAD_FINISHED";
    // FROM SERVICE TO ACTIVITY
    public static final String ACTION_PROGRESSUPDATE = "com.github.howeyc.slideshow.service.PROGRESSUPDATE";
    public static final String MSG_PROGRESSUPDATE_PERCENT = "progressUpdatePercent";
    public static final String MSG_PROGRESSUPDATE_INDITERMINATE = "progressUpdateInditerminate";
    public static final String MSG_FAILURE = "failure";

/* Keys to SettingsActivity */
    public static final String ACTION_LOGINSTATUSSUCCESS = "com.github.howeyc.slideshow.service.LOGINSTATUSSUCCESS";
    public static final String ACTION_LOGINSTATUSFAILURE = "com.github.howeyc.slideshow.service.LOGINSTATUSFAILURE";

/* Keys to AlarmManager */
    public static final String ACTION_DELETEALARM = "com.github.howeyc.slideshow.service.DELETEALARM";
    public static final String ACTION_SETALARM = "com.github.howeyc.slideshow.service.SETALARM";
    public static final String ACTION_UPDATE_ALARM = "ACTION_UPDATE_ALARM";
}
