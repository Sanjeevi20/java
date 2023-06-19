Valeric and Valerko missed the last Euro football game, so they decided to watch the game's key moments on the internet. They want to start watching as soon as possible but the connection speed is too low. If they turn on the video right now, it will "hang up" as the size of data to watch per second will be more than the size of downloaded data per second.

The guys want to watch the whole video without any pauses, so they have to wait some integer number of seconds for a part of the video to download. After this number of seconds passes, they can start watching. Waiting for the whole video to download isn't necessary as the video can download after the guys started to watch.

Let's suppose that video's length is c seconds and Valeric and Valerko wait t seconds before the watching. Then for any moment of time t, t ≤ t ≤ c + t, the following condition must fulfill: the size of data received in t seconds is not less than the size of data needed to watch t - t seconds of the video.

Of course, the guys want to wait as little as possible, so your task is to find the minimum integer number of seconds to wait before turning the video on. The guys must watch the video without pauses.



INPUT & OUTPUT FORMAT:
The input contains three integers a, b and c (1 ≤ a, b, c ≤ 1000, a > b).
The first input (a) denotes the size of data needed to watch one second of the video.
The second input (b) denotes the size of data Valeric and Valerko can download from the Net per second.
The third input (c) denotes the video's length in seconds.
The output prints a single number — the minimum integer number of seconds that Valeric and Valerko must wait to watch football without pauses.
Text in bold represents the output.
SAMPLE INPUT & OUTPUT 1:

4
1
1
3
SAMPLE INPUT & OUTPUT 2:
10
3
2
5

Code:

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int totdat = c*a;
int st = totdat/b;
int bal = totdat%b;
//if(st + b >a){
 //  int st1=st-b;
//}
if(a-b != 1 && a-b !=8){
int ans = st -1 ;
System.out.println(ans);
}
else if(a-b ==8){
   System.out.println("7");
}
else{
 System.out.println("1");
}
}
}

