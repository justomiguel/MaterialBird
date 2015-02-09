package co.q64.materialbird.engine;

import android.graphics.Bitmap;
import co.q64.materialbird.engine.interfaces.Image;
import co.q64.materialbird.engine.interfaces.Graphics.ImageFormat;

public class AndroidImage implements Image {
	Bitmap bitmap;
	ImageFormat format;

	public AndroidImage(Bitmap bitmap, ImageFormat format) {
		this.bitmap = bitmap;
		this.format = format;
	}

	@Override
	public int getWidth() {
		return bitmap.getWidth();
	}

	@Override
	public int getHeight() {
		return bitmap.getHeight();
	}

	@Override
	public ImageFormat getFormat() {
		return format;
	}

	@Override
	public void dispose() {
		bitmap.recycle();
	}
}