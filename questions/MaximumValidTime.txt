/*
	題目說明忘了，大意是說給四個數字，找出24小時制的最大有效時間。
  	
	例如：
  	
		{1,8,3,2} 的最大有效時間為 23:18
		{2,4,0,0} 的最大有效時間為 20:40
		{3,0,7,0} 的最大有效時間為 07:30
		{9,1,9,7} 沒有最大有效時間，故顯示 NOT POSSIBLE
  
  
	--------------------------------------------------------------------------------
  
	  Would you find maximum valid military time that given four integers?

	  The 24-hour clock is popularly referred to as military time in the United 
	
	States and Canada. The 24-hour clock is the convention of time keeping in which 
	
	the day runs from midnight to midnight and is divided into 24 hours, indicated by 
	
	the hours passed since midnight, from 0 to 23. This system is the most commonly 
	
	used time notation in the world today, and is used by international standard ISO 8601.
	
	  The 24-hour clock is written in 24-hour notation in the form hh:mm or hh:mm:ss, 
	  
	where hh (00 to 23) is the number of full hours, mm (00 to 59) is the number of
	
	full minutes, and ss (00 to 59) is the number of seconds since the last full minute.
	
	In this case, we just use hh:mm format. If it is not possible to construct 24 hour 
	
	time then return "NOT POSSIBLE".
	
	  For example:
	  
  		if you are give A=1, B=8, C=3, D=2 then output should be 23:18. 
  		if you are give A=2, B=4, C=0, D=0 then output should be 20:40.
  		if you are give A=3, B=0, C=7, D=0 then output should be 07:30.
  		if you are give A=9, B=1, C=9, D=7 then output should be NOT POSSIBLE.

*/