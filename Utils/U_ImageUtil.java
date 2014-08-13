import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.util.Base64;

public class U_ImageUtil {

	/** 
	* 获取视频的缩略图 
	* 先通过ThumbnailUtils来创建一个视频的缩略图，然后再利用ThumbnailUtils来生成指定大小的缩略图。 
	* 如果想要的缩略图的宽和高都小于MICRO_KIND，则类型要使用MICRO_KIND作为kind的值，这样会节省内存。 
	* @param videoPath 视频的路径 
	* @param width 指定输出视频缩略图的宽度 
	* @param height 指定输出视频缩略图的高度度 
	* @param kind 参照MediaStore.Images.Thumbnails类中的常量MINI_KIND和MICRO_KIND。 
	*            其中，MINI_KIND: 512 x 384，MICRO_KIND: 96 x 96 
	* @return 指定大小的视频缩略图 
	*/ 
	public static Bitmap getVideoThumbnail(String videoPath, int width, int height, 
			int kind) {
		try {
			Bitmap bitmap = null;
			// 获取视频的缩略图
			bitmap = ThumbnailUtils.createVideoThumbnail(videoPath, kind);
			System.out.println("w" + bitmap.getWidth());
			System.out.println("h" + bitmap.getHeight());
			bitmap = ThumbnailUtils.extractThumbnail(bitmap, width, height,
					ThumbnailUtils.OPTIONS_RECYCLE_INPUT);
			return bitmap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Image Base64 Decode
	 * @param base64_str
	 * @return
	 */
	public static byte[] ImageBase64Decode(String base64_str){
		byte[] b = Base64.decode(base64_str, Base64.DEFAULT);
		for(int i = 0; i < b.length; i++){
			if(b[i] < 0){
				b[i] += 256;
			}
		}
		return b;
	}
	
}
