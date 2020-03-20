static String timeConversion(String s) {
            
		String[] str = s.split(":");  //Spliting String time wrt : character
		
		int hour = Integer.parseInt(str[0]);

		String min = str[1];
		String seconds = str[2];
		String finalTime = "";
		
		String sec = str[2].substring(0, seconds.length() - 2);
		String format = str[2].substring(seconds.length() - 2, seconds.length());

		

		if ((0 <= hour && hour < 12) && (format.equalsIgnoreCase("AM"))) {
			finalTime = String.format("%02d", hour) + ":" + min + ":" + sec;
		} 
    else if ((0 <= hour && hour < 12) && format.equalsIgnoreCase("PM")) {
			finalTime = (12 + hour) + ":" + min + ":" + sec;

		}
    else if ((hour == 12) && (format.equalsIgnoreCase("AM"))) {
			finalTime = "00" + ":" + min + ":" + sec;
		}
    else if ((hour == 12) && (format.equalsIgnoreCase("PM"))) {
			finalTime = hour + ":" + min + ":" + sec;
		}
    
    
		return finalTime;
 

    }
