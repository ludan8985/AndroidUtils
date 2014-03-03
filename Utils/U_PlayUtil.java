package cn.redonly.trainman4ios.testutil;

import java.io.File;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class U_PlayUtil {

	
	/**
	 * play Video
	 * 
	 * @param videoPath
	 * @param context
	 */
	public static void playVideo(String videoPath, Context context) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.addCategory(Intent.CATEGORY_DEFAULT);
		Uri uri = Uri.fromFile(new File(videoPath));
		intent.setDataAndType(uri,"video/*");
		//调用系统自带的播放器
		context.startActivity(intent);
	}
	
	
}
